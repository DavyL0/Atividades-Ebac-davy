package br.com.davy;

import br.com.davy.dao.ClienteDaoMock;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.example.services.ClienteService;
import org.example.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Project: md25
 * Package: br.com.davy
 * <p>
 * User: Davy Lopes
 * Email: davylopes866@gmail.com
 * Date: 18/01/2025
 * Time: 08:27
 * <p>
 */
public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
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

        clienteService.salvar(cliente);
    }
    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {
        boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Davyzao");
        clienteService.alterar(cliente);

        Assert.assertEquals(cliente.getNome(), "Davyzao");
    }
}
