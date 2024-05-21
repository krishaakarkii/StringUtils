import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UtilitiesTest {

    private Utilities utilities;

    @Before
    public void setUp() {
        utilities = new Utilities();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFactorial() {
        utilities.factorial(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPower() {
        utilities.power(2, -3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIsPrime() {
        utilities.isPrime(-7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidReverseString() {
        utilities.reverseString(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFibonacci() {
        utilities.fibonacci(-10);
    }

}

