package test;
import src.File4;
import static org.junit.Assert.*;
import org.junit.Test;

public class File4Test {

    @Test
    public void testFactorialWithLargeNumber() {
        File4 file4 = new File4();
        assertEquals(3628800, file4.factorial(10));
    }

    @Test
    public void testDivideNegativeNumber() {
        File4 file4 = new File4();
        assertEquals(-2.5, file4.divide(-5, 2), 0.0001);
    }

    @Test
    public void testIsPrimeWithLargeNumber() {
        File4 file4 = new File4();
        assertTrue(file4.isPrime(997)); // Large prime number
        assertFalse(file4.isPrime(999)); // Composite number
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        File4 file4 = new File4();
        assertTrue(file4.isPalindrome(""));
    }

    @Test
    public void testSquareWithNegativeNumber() {
        File4 file4 = new File4();
        assertEquals(25, file4.square(-5));
    }

    @Test
    public void testFactorialWithZero() {
        File4 file4 = new File4();
        assertEquals(1, file4.factorial(0));
    }

    @Test
    public void testDivideByNegativeNumber() {
        File4 file4 = new File4();
        assertEquals(-2.5, file4.divide(5, -2), 0.0001);
    }

    @Test
    public void testIsPrimeWithOne() {
        File4 file4 = new File4();
        assertFalse(file4.isPrime(1));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        File4 file4 = new File4();
        assertTrue(file4.isPalindrome("a"));
    }

    @Test
    public void testSquareWithZero() {
        File4 file4 = new File4();
        assertEquals(0, file4.square(0));
    }

    @Test
    public void testFactorialWithLargeNumberTwo() {
        File4 file4 = new File4();
        assertEquals(39916800, file4.factorial(11));
    }

    @Test
    public void testDivideByOne() {
        File4 file4 = new File4();
        assertEquals(5.0, file4.divide(5, 1), 0.0001);
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        File4 file4 = new File4();
        assertFalse(file4.isPrime(-5));
    }

    @Test
    public void testIsPalindromeWithNonPalindrome() {
        File4 file4 = new File4();
        assertFalse(file4.isPalindrome("hello world"));
    }

    @Test
    public void testSquareWithLargeNumber() {
        File4 file4 = new File4();
        assertEquals(16, file4.square(4));
    }
}

