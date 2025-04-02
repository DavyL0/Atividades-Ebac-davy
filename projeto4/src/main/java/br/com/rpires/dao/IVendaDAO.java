/**
 * 
 */
package br.com.rpires.dao;

import br.com.rpires.dao.generic.IGenericDAO;
import br.com.rpires.domain.Venda;
import br.com.rpires.exceptions.DAOException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda) throws br.com.rpires.dao.generic.TipoChaveNaoEncontradaException, DAOException, br.com.rpires.dao.DAOException, TipoChaveNaoEncontradaException;
	
	public void cancelarVenda(Venda venda) throws br.com.rpires.dao.TipoChaveNaoEncontradaException, DAOException, br.com.rpires.dao.DAOException;

	public Venda consultarVenda(Long id) throws DAOException;

	public Venda cadastrarVenda(Venda entity) throws DAOException, br.com.rpires.dao.DAOException;
}
