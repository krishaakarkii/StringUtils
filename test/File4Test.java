import static org.junit.Assert.*;
import org.junit.Test;

public class File4Test {

    @Test
    public void testFactorial() {
        File4 file4 = new File4();
        assertEquals(1, file4.factorial(0));
        assertEquals(1, file4.factorial(1));
        assertEquals(120, file4.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeNumber() {
        File4 file4 = new File4();
        file4.factorial(-5);
    }

    @Test
    public void testDivide() {
        File4 file4 = new File4();
        assertEquals(2.5, file4.divide(5, 2), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        File4 file4 = new File4();
        file4.divide(5, 0);
    }

    @Test
    public void testIsPrime() {
        File4 file4 = new File4();
        assertTrue(file4.isPrime(2));
        assertTrue(file4.isPrime(3));
        assertFalse(file4.isPrime(4));
        assertTrue(file4.isPrime(5));
    }

    @Test
    public void testIsPalindrome() {
        File4 file4 = new File4();
        assertTrue(file4.isPalindrome("radar"));
        assertTrue(file4.isPalindrome("level"));
        assertFalse(file4.isPalindrome("hello"));
    }

    @Test
    public void testSquare() {
        File4 file4 = new File4();
        assertEquals(25, file4.square(5));
        assertEquals(0, file4.square(0));
    }
}

