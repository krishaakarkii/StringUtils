import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {

    private Calc calc;

    @Before
    public void setUp() {
        calc = new Calc();
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int result = calc.divide(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorial() {
        int result = calc.factorial(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSquareRoot() {
        double result = calc.squareRoot(-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidExponentiation() {
        double result = calc.power(0, -3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperation() {
        int result = calc.performOperation(10, 5, "invalid");
    }

}

