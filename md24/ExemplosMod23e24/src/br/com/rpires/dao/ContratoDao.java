package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() {
        System.out.println("buscar");
    }

    @Override
    public void excluir() {
        System.out.println("excluir");
    }

    @Override
    public void atualizar() {
        System.out.println("atualizar");
    }
}
