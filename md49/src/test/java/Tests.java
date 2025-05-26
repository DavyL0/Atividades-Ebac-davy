import org.davy.Calculadora;
import org.davy.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

/**
 * Project: md49
 * Package: PACKAGE_NAME
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 26/05/2025
 * Time: 13:22
 * <p>
 */
public class Tests {
        @Test
        public void deveSomarCorretamente() {
            Calculadora calculadora = new Calculadora();

            Assert.assertEquals(3, calculadora.soma(1, 2));
            Assert.assertEquals(0, calculadora.soma(2, -2));
            Assert.assertEquals(-5, calculadora.soma(-2, -3));
        }

        @Test
        public void deveMultiplicarCorretamente() {
            Calculadora calculadora = new Calculadora();

            Assert.assertEquals(2, calculadora.mul(1, 2));
            Assert.assertEquals(0, calculadora.mul(5, 0));
            Assert.assertEquals(-6, calculadora.mul(-2, 3));
        }

        @Test
        public void deveDividirCorretamente() {
            Calculadora calculadora = new Calculadora();

            Assert.assertEquals(0, calculadora.div(1, 2));
            Assert.assertEquals(2, calculadora.div(4, 2));
            Assert.assertEquals(-3, calculadora.div(-6, 2));
        }

        @Test(expected = ArithmeticException.class)
        public void deveLancarExcecaoAoDividirPorZero() {
            Calculadora calculadora = new Calculadora();
            calculadora.div(5, 0); // Espera exception
        }

        @Test
        public void deveCalcularFibonacciCorretamente() {
            Fibonacci fibonacci = new Fibonacci();

            Assert.assertEquals(1, Fibonacci.encontraElemento(2));
            Assert.assertEquals(2, Fibonacci.encontraElemento(3));
            Assert.assertEquals(3, Fibonacci.encontraElemento(4));
            Assert.assertEquals(5, Fibonacci.encontraElemento(5));
            Assert.assertEquals(8, Fibonacci.encontraElemento(6));
            Assert.assertEquals(13, Fibonacci.encontraElemento(7));
        }
}
