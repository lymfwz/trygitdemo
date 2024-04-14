import org.junit.Assert;
import org.junit.Test;

/**
 * @AUTHOR: qiukui
 * @CREATE: 2024-04-14-21:56
 */
public class CalculatorTest {

    @Test
    public void shouldReturn2When1Plus1() throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int real = calculator.compute(1, 1, "Add");
        int expected = 2;
        Assert.assertEquals(expected, real);
    }

    @Test
    public void shouldReturn4When2Mul2() throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int real = calculator.compute(2, 2, "Mul");
        int expected = 4;
        Assert.assertEquals(expected, real);
    }

}
