import org.example.dao.IProdutoDAO;
import org.example.dao.ProdutoDAO;
import org.example.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project: exemplojdbc
 * Package: PACKAGE_NAME
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/02/2025
 * Time: 16:13
 * <p>
 */
public class TestProduto {
    private IProdutoDAO produtoDAO;

    @Test
    public void cadastrarTest() throws Exception{
        IProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = new Produto();

        produto.setNome("Macaco");
        produto.setPreco(40.3);
        produto.setCodigo("10");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoDB = produtoDAO.consultar(produto.getCodigo());
        assertNotNull(produtoDB);
        assertEquals(produto.getNome(), produtoDB.getNome());
        assertEquals(produto.getPreco(), produtoDB.getPreco());
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());

        Integer countDelet = produtoDAO.excluir(produto);
        assertTrue(countDelet == 1);
    }

    @Test
    public void alterarTest() throws Exception{
        IProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = new Produto();
        produto.setNome("Macaco");
        produto.setPreco(50.3);
        produto.setCodigo("10");
        Integer countAlter = produtoDAO.alterar(produto);
        assertTrue(countAlter == 1);

        Produto produtoDB = produtoDAO.consultar(produto.getCodigo());
        assertNotNull(produtoDB);
        assertEquals(produto.getNome(), produtoDB.getNome());
        assertEquals(produto.getPreco(), produtoDB.getPreco());
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());

        Integer countDelet = produtoDAO.excluir(produto);
        assertTrue(countDelet == 1);
    }
}
