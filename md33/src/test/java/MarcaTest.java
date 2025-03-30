import org.davy.dao.IMarcaDao;
import org.davy.dao.MarcaDao;
import org.davy.domain.Marca;
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
public class MarcaTest {
    private IMarcaDao marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDao();
    }
    @Test
    public void test() {
        Marca marca = new Marca();
        marca.setNome("Fiat");
        marca.setCarro(carro.id);

        marca = marcaDao.cadastrarMarca(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
