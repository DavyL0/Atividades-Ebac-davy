import org.davy.dao.CarroDao;
import org.davy.dao.ICarroDao;
import org.davy.domain.Carro;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Project: md33
 * Package: PACKAGE_NAME
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 28/03/2025
 * Time: 17:58
 * <p>
 */
public class CarroTest {
    ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }
    @Test
    public void cadastrarCarro() {
        Carro carro = new Carro();
        carro.setNome("Fiat Coupe");
        carro.setPreco(40000);
        carro.setAcessorio(1);
        carro.setMarcaList(1);
        carro = carroDao.cadastrarCarro(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
