package test;
import src.File1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the File1 class.
 */
public class File1Test {

    @Test
    public void testSetValue() {
        File1 file1 = new File1();
        file1.setValue(10);
        assertEquals(10, file1.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValueNegative() {
        File1 file1 = new File1();
        file1.setValue(-1);
    }

    @Test
    public void testGreet() {
        File1 file1 = new File1();
        assertEquals("Hello, John!", file1.greet("John"));
    }

    @Test
    public void testSquare() {
        File1 file1 = new File1();
        assertEquals(25, file1.square(5));
    }

    @Test
    public void testIsEven() {
        File1 file1 = new File1();
        assertTrue(file1.isEven(4));
        assertFalse(file1.isEven(3));
    }

    @Test
    public void testConcatenate() {
        File1 file1 = new File1();
        assertEquals("HelloWorld", file1.concatenate("Hello", "World"));
    }

    @Test(expected = Exception.class)
    public void testThrowException() throws Exception {
        File1 file1 = new File1();
        file1.throwException();
    }

}

