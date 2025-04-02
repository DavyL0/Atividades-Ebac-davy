package br.com.rpires;

import br.com.rpires.dao.DAOException;
import br.com.rpires.dao.TipoChaveNaoEncontradaException;
import br.com.rpires.domain.Venda;
import br.com.rpires.generic.GenericDao;

/**
 * Project: projeto4
 * Package: br.com.rpires
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 01/04/2025
 * Time: 22:28
 * <p>
 */
public class VendaExclusaoDaoTest extends GenericDao.GenericDao<Venda, Long> implements IVendaDao {

    public VendaExclusaoDaoTest(){
        super(Venda.class);
    }

    public VendaExclusaoDaoTest(Class<Venda> persistenteClass) {
        super(persistenteClass);
    }

    @Override
    public void finalizarVenda(Venda vendaJpa) throws TipoChaveNaoEncontradaException, DAOException {

    }

    @Override
    public void cancelarVenda(Venda vendaJpa) throws TipoChaveNaoEncontradaException, DAOException {

    }

    @Override
    public VendaJpa consultarCollection(Long id) {
        return null;
    }
}