import org.example.dao.IProdutoDao;
import org.example.dao.ProdutoDao;
import org.example.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Project: md32
 * Package: PACKAGE_NAME
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 21/03/2025
 * Time: 09:05
 * <p>
 */
public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest(){
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrarProduto() {
        Produto p = new Produto();
        p.setNome("Produto 1");
        p.setPreco(20.0);
        p = produtoDao.cadastrarProduto(p);

        assertNotNull(p);
        assertNotNull(p.getId());

    }
}
