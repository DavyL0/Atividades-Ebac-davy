package br.com.davy;

import br.com.davy.dao.ClienteDaoMock;
import org.example.dao.ClienteDAO;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.example.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Project: md25
 * Package: br.com.davy
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 04/02/2025
 * Time: 08:16
 * <p>
 */
public class ClienteDAOTest {

    private IClienteDAO clienteDao;
    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();

    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(12345678901L);
        cliente.setNome("Davy");
        cliente.setCidade("Goiania");
        cliente.setEndereco("Rua1");
        cliente.setEstado("GO");
        cliente.setTelefone(12345678901L);

        clienteDao.salvar(cliente);
    }
    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {
        boolean retorno = clienteDao.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Davyzao");
        clienteDao.alterar(cliente);

        Assert.assertEquals(cliente.getNome(), "Davyzao");
    }
}
