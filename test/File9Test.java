package test;
import src.File9;
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
    

    @Test
public void testFibonacciRecursiveAdditional() {
    File9 file9 = new File9();
    assertEquals(21, file9.fibonacciRecursive(8));
    assertEquals(34, file9.fibonacciRecursive(9));
    assertEquals(55, file9.fibonacciRecursive(10));
}

@Test
public void testFibonacciIterativeAdditional() {
    File9 file9 = new File9();
    assertEquals(21, file9.fibonacciIterative(8));
    assertEquals(34, file9.fibonacciIterative(9));
    assertEquals(55, file9.fibonacciIterative(10));
}

@Test
public void testIsPerfectSquareAdditional() {
    File9 file9 = new File9();
    assertTrue(file9.isPerfectSquare(36));
    assertTrue(file9.isPerfectSquare(49));
    assertTrue(file9.isPerfectSquare(64));
    assertTrue(file9.isPerfectSquare(81));
    assertTrue(file9.isPerfectSquare(100));
    assertFalse(file9.isPerfectSquare(-1));
}

@Test
public void testFactorialRecursiveAdditional() {
    File9 file9 = new File9();
    assertEquals(5040, file9.factorialRecursive(7));
    assertEquals(40320, file9.factorialRecursive(8));
    assertEquals(362880, file9.factorialRecursive(9));
    assertEquals(3628800, file9.factorialRecursive(10));
}

@Test
public void testFactorialIterativeAdditional() {
    File9 file9 = new File9();
    assertEquals(5040, file9.factorialIterative(7));
    assertEquals(40320, file9.factorialIterative(8));
    assertEquals(362880, file9.factorialIterative(9));
    assertEquals(3628800, file9.factorialIterative(10));
}



   @Test
public void testFibonacciRecursiveAdditional2() {
    File9 file9 = new File9();
    assertEquals(89, file9.fibonacciRecursive(11));
    assertEquals(144, file9.fibonacciRecursive(12));
    assertEquals(233, file9.fibonacciRecursive(13));
}

@Test
public void testFibonacciIterativeAdditional2() {
    File9 file9 = new File9();
    assertEquals(89, file9.fibonacciIterative(11));
    assertEquals(144, file9.fibonacciIterative(12));
    assertEquals(233, file9.fibonacciIterative(13));
}

@Test
public void testIsPerfectSquareAdditional2() {
    File9 file9 = new File9();
    assertTrue(file9.isPerfectSquare(121));
    assertTrue(file9.isPerfectSquare(144));
    assertTrue(file9.isPerfectSquare(169));
    assertTrue(file9.isPerfectSquare(196));
    assertTrue(file9.isPerfectSquare(225));
    assertFalse(file9.isPerfectSquare(-4));
}

@Test
public void testFactorialRecursiveAdditional2() {
    File9 file9 = new File9();
    assertEquals(39916800, file9.factorialRecursive(11));
    assertEquals(479001600, file9.factorialRecursive(12));
    assertEquals(6227020800L, file9.factorialRecursive(13));
}

@Test
public void testFactorialIterativeAdditional2() {
    File9 file9 = new File9();
    assertEquals(39916800, file9.factorialIterative(11));
    assertEquals(479001600, file9.factorialIterative(12));
    assertEquals(6227020800L, file9.factorialIterative(13));
}
}
