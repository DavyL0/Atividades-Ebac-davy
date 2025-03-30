import org.davy.dao.AcessorioDao;
import org.davy.dao.IAcessorioDao;
import org.davy.domain.Acessorio;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Project: md33
 * Package: PACKAGE_NAME
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 28/03/2025
 * Time: 17:59
 * <p>
 */
public class AcessTest {
    private IAcessorioDao acessorioDao;

    public AcessTest() {
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrarAcessorio() {
        Acessorio p = new Acessorio();
        p.setName("Acessorio 1");
        p.setValue(20.0);
        p = acessorioDao.cadastrarAcessorio(p);

        assertNotNull(p);
        assertNotNull(p.getId());
    }
}
