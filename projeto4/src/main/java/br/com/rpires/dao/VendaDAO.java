/**
 * 
 */
package br.com.rpires.dao;
import br.com.rpires.dao.generic.GenericDAO;
import br.com.rpires.domain.Cliente;
import br.com.rpires.domain.Produto;
import br.com.rpires.domain.Venda;
import br.com.rpires.exceptions.DAOException;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


/**
 * @author rodrigo.pires
 *
 */
public class VendaDAO extends GenericDAO<Venda, Long> implements IVendaDAO {

	public VendaDAO() {
		super(Venda.class);
	}

	@Override
	public void finalizarVenda(Venda venda) throws br.com.rpires.dao.DAOException, br.com.rpires.dao.TipoChaveNaoEncontradaException {
		super.alterar(venda);
	}

	@Override
	public void cancelarVenda(Venda venda) throws br.com.rpires.dao.TipoChaveNaoEncontradaException, br.com.rpires.dao.DAOException {
		super.alterar(venda);
	}

	@Override
	public Venda consultarVenda(Long id) throws DAOException {
		openConnection();
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Venda> query = builder.createQuery(Venda.class);
		Root<Venda> root = query.from(Venda.class);
		root.fetch("cliente");
		root.fetch("produto");
		query.select(root).where(builder.equal(root.get("id"), id));
		TypedQuery<Venda> typedQuery = entityManager.createQuery(query);
		Venda venda = typedQuery.getSingleResult();
		closeConnection();
        return venda;
    }

	@Override
	public Venda cadastrarVenda(Venda entity) throws DAOException, br.com.rpires.dao.DAOException {
		try {
			openConnection();
			entity.getProdutos().forEach(prod -> {
				Produto produto = entityManager.merge(prod.getProduto());
				prod.setProduto(produto);
			});
			Cliente cliente = entityManager.merge(entity.getCliente());
			entity.setCliente(cliente);
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			closeConnection();
			return entity;
		}catch (Exception e) {
			throw new DAOException("Erro ao cadastrar Venda", e);
		}
	}

}
