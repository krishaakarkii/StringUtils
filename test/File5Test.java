// File5Test.java

import static org.junit.Assert.*;
import org.junit.Test;

public class File5Test {

    @Test
    public void testMax() {
        File5 file5 = new File5();
        assertEquals(5, file5.max(3, 5));
        assertEquals(-3, file5.max(-3, -5));
        assertEquals(10, file5.max(10, 10));
        assertEquals(100, file5.max(100, 50));
        assertEquals(2, file5.max(1, 2));
    }

    @Test
    public void testFactorial() {
        File5 file5 = new File5();
        assertEquals(120, file5.factorial(5));
        assertEquals(1, file5.factorial(0));
        try {
            file5.factorial(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Input must be non-negative", e.getMessage());
        }
        assertEquals(1, file5.factorial(1));
        assertEquals(6, file5.factorial(3));
    }

    @Test
    public void testIsPrime() {
        File5 file5 = new File5();
        assertTrue(file5.isPrime(2));
        assertTrue(file5.isPrime(3));
        assertTrue(file5.isPrime(7));
        assertFalse(file5.isPrime(4));
        assertFalse(file5.isPrime(10));
        assertTrue(file5.isPrime(13));
        assertFalse(file5.isPrime(15));
        assertFalse(file5.isPrime(20));
        assertFalse(file5.isPrime(25));
        assertFalse(file5.isPrime(49));
    }

    @Test
    public void testConcatenate() {
        File5 file5 = new File5();
        assertEquals("HelloWorld", file5.concatenate("Hello", "World"));
        assertEquals("", file5.concatenate("", ""));
        assertEquals("JavaProgramming", file5.concatenate("Java", "Programming"));
        assertEquals("OpenAIGPT", file5.concatenate("OpenAI", "GPT"));
        assertEquals("TestJUnit", file5.concatenate("Test", "JUnit"));
    }

    @Test
    public void testThrowException() {
        File5 file5 = new File5();
        try {
            file5.throwException();
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Exception in File5", e.getMessage());
        }
    }

    @Test
    public void testMaxNegative() {
        File5 file5 = new File5();
        assertEquals(-1, file5.max(-5, -1));
        assertEquals(-5, file5.max(-5, -10));
        assertEquals(-3, file5.max(-3, -3));
        assertEquals(-100, file5.max(-100, -500));
        assertEquals(-2, file5.max(-2, -3));
    }

    @Test
    public void testFactorialEdgeCases() {
        File5 file5 = new File5();
        assertEquals(1, file5.factorial(1));
        assertEquals(1, file5.factorial(0));
    }

    @Test
    public void testIsPrimeEdgeCases() {
        File5 file5 = new File5();
        assertFalse(file5.isPrime(0));
        assertFalse(file5.isPrime(1));
        assertTrue(file5.isPrime(2));
        assertTrue(file5.isPrime(3));
    }

    @Test
    public void testConcatenateEmptyStrings() {
        File5 file5 = new File5();
        assertEquals("Hello", file5.concatenate("Hello", ""));
        assertEquals("World", file5.concatenate("", "World"));
        assertEquals("", file5.concatenate("", ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeInput() {
        File5 file5 = new File5();
        file5.factorial(-5);
    }

    @Test
    public void testThrowExceptionWithDifferentMessages() {
        File5 file5 = new File5();
        try {
            file5.throwException();
            fail("Expected Exception");
        } catch (Exception e) {
            assertNotEquals("Exception in File4", e.getMessage());
        }
    }
}

