import org.junit.Test;
import static org.junit.Assert.*;

public class File9Test {

    @Test
    public void testFibonacciRecursive() {
        File9 file9 = new File9();
        assertEquals(0, file9.fibonacciRecursive(0));
        assertEquals(1, file9.fibonacciRecursive(1));
        assertEquals(1, file9.fibonacciRecursive(2));
        assertEquals(2, file9.fibonacciRecursive(3));
        assertEquals(3, file9.fibonacciRecursive(4));
        assertEquals(5, file9.fibonacciRecursive(5));
        assertEquals(8, file9.fibonacciRecursive(6));
        assertEquals(13, file9.fibonacciRecursive(7));
    }

    @Test
    public void testFibonacciIterative() {
        File9 file9 = new File9();
        assertEquals(0, file9.fibonacciIterative(0));
        assertEquals(1, file9.fibonacciIterative(1));
        assertEquals(1, file9.fibonacciIterative(2));
        assertEquals(2, file9.fibonacciIterative(3));
        assertEquals(3, file9.fibonacciIterative(4));
        assertEquals(5, file9.fibonacciIterative(5));
        assertEquals(8, file9.fibonacciIterative(6));
        assertEquals(13, file9.fibonacciIterative(7));
    }

    @Test
    public void testIsPerfectSquare() {
        File9 file9 = new File9();
        assertTrue(file9.isPerfectSquare(1));
        assertTrue(file9.isPerfectSquare(4));
        assertTrue(file9.isPerfectSquare(9));
        assertTrue(file9.isPerfectSquare(16));
        assertTrue(file9.isPerfectSquare(25));
        assertFalse(file9.isPerfectSquare(2));
        assertFalse(file9.isPerfectSquare(3));
        assertFalse(file9.isPerfectSquare(5));
        assertFalse(file9.isPerfectSquare(6));
        assertFalse(file9.isPerfectSquare(7));
        assertFalse(file9.isPerfectSquare(8));
    }

    @Test
    public void testFactorialRecursive() {
        File9 file9 = new File9();
        assertEquals(1, file9.factorialRecursive(0));
        assertEquals(1, file9.factorialRecursive(1));
        assertEquals(2, file9.factorialRecursive(2));
        assertEquals(6, file9.factorialRecursive(3));
        assertEquals(24, file9.factorialRecursive(4));
        assertEquals(120, file9.factorialRecursive(5));
        assertEquals(720, file9.factorialRecursive(6));
    }

    @Test
    public void testFactorialIterative() {
        File9 file9 = new File9();
        assertEquals(1, file9.factorialIterative(0));
        assertEquals(1, file9.factorialIterative(1));
        assertEquals(2, file9.factorialIterative(2));
        assertEquals(6, file9.factorialIterative(3));
        assertEquals(24, file9.factorialIterative(4));
        assertEquals(120, file9.factorialIterative(5));
        assertEquals(720, file9.factorialIterative(6));
    }
}

