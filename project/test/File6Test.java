// File6Test.java
package test;
import src.File6;
import static org.junit.Assert.*;
import org.junit.Test;

public class File6Test {

    @Test
    public void testSum() {
        File6 file6 = new File6();
        assertEquals(5, file6.sum(2, 3));
        assertEquals(0, file6.sum(-2, 2));
        assertEquals(10, file6.sum(5, 5));
        assertEquals(-5, file6.sum(0, -5));
        assertEquals(100, file6.sum(50, 50));
    }

    @Test
    public void testDifference() {
        File6 file6 = new File6();
        assertEquals(-1, file6.difference(2, 3));
        assertEquals(-4, file6.difference(-2, 2));
        assertEquals(0, file6.difference(5, 5));
        assertEquals(5, file6.difference(0, -5));
        assertEquals(0, file6.difference(50, 50));
    }

    @Test
    public void testMultiply() {
        File6 file6 = new File6();
        assertEquals(6, file6.multiply(2, 3));
        assertEquals(-4, file6.multiply(-2, 2));
        assertEquals(25, file6.multiply(5, 5));
        assertEquals(0, file6.multiply(0, -5));
        assertEquals(2500, file6.multiply(50, 50));
    }

    @Test
    public void testDivide() {
        File6 file6 = new File6();
        assertEquals(2.5, file6.divide(5, 2), 0.001);
        assertEquals(-1, file6.divide(-5, 5), 0.001);
        assertEquals(1, file6.divide(5, 5), 0.001);
        assertEquals(0, file6.divide(0, 5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        File6 file6 = new File6();
        file6.divide(5, 0);
    }

    @Test
    public void testIsEqual() {
        File6 file6 = new File6();
        assertTrue(file6.isEqual(5, 5));
        assertFalse(file6.isEqual(5, 6));
        assertFalse(file6.isEqual(-5, 5));
        assertTrue(file6.isEqual(0, 0));
        assertTrue(file6.isEqual(-100, -100));
    }
}

