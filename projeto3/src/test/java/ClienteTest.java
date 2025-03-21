import org.com.davy.dao.generic.jdbc.dao.ClienteDAO;
import org.com.davy.dao.generic.jdbc.dao.IClienteDAO;
import org.com.davy.domain.Cliente;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project: projeto3
 * Package: PACKAGE_NAME
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/02/2025
 * Time: 16:25
 * <p>
 */
public class ClienteTest {

    private IClienteDAO clienteDAO;

    @Test
    public void cadastrarTest()throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setNome("Jose");
        cliente.setCodigo("10");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clienteDB = clienteDAO.buscar("10");
        assertNotNull( clienteDB );
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        assertEquals(cliente.getNome(), clienteDB.getNome());

        Integer countDel = clienteDAO.excluir(clienteDB);
        assertTrue(countDel == 1);
    }
}
