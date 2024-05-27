// File7Test.java
package test;
import src.File7;
import static org.junit.Assert.*;
import org.junit.Test;

public class File7Test {

    @Test
    public void testMax() {
        File7 file7 = new File7();
        assertEquals(5, file7.max(3, 5));
        assertEquals(-3, file7.max(-3, -5));
        assertEquals(10, file7.max(10, 10));
        assertEquals(100, file7.max(100, 50));
        assertEquals(2, file7.max(1, 2));
    }

    @Test
    public void testFactorial() {
        File7 file7 = new File7();
        assertEquals(120, file7.factorial(5));
        assertEquals(1, file7.factorial(0));
        try {
            file7.factorial(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Input must be non-negative", e.getMessage());
        }
        assertEquals(1, file7.factorial(1));
        assertEquals(6, file7.factorial(3));
    }

    @Test
    public void testIsPrime() {
        File7 file7 = new File7();
        assertTrue(file7.isPrime(2));
        assertTrue(file7.isPrime(3));
        assertTrue(file7.isPrime(7));
        assertFalse(file7.isPrime(4));
        assertFalse(file7.isPrime(10));
        assertTrue(file7.isPrime(13));
        assertFalse(file7.isPrime(15));
        assertFalse(file7.isPrime(20));
        assertFalse(file7.isPrime(25));
        assertFalse(file7.isPrime(49));
    }

    @Test
    public void testConcatenate() {
        File7 file7 = new File7();
        assertEquals("HelloWorld", file7.concatenate("Hello", "World"));
        assertEquals("", file7.concatenate("", ""));
        assertEquals("JavaProgramming", file7.concatenate("Java", "Programming"));
        assertEquals("OpenAIGPT", file7.concatenate("OpenAI", "GPT"));
        assertEquals("TestJUnit", file7.concatenate("Test", "JUnit"));
    }

    @Test(expected = Exception.class)
    public void testThrowException() throws Exception {
        File7 file7 = new File7();
        file7.throwException();
    }
}

