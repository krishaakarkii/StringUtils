// File2Test.java

import static org.junit.Assert.*;
import org.junit.Test;

public class File2Test {

    @Test
    public void testGetStringLength() {
        File2 file2 = new File2();
        assertEquals(5, file2.getStringLength("Hello"));
        assertEquals(0, file2.getStringLength(""));
    }

    @Test
    public void testToUpperCase() {
        File2 file2 = new File2();
        assertEquals("HELLO", file2.toUpperCase("hello"));
        assertEquals("", file2.toUpperCase(""));
    }

    @Test
    public void testContainsSubstring() {
        File2 file2 = new File2();
        assertTrue(file2.containsSubstring("Hello World", "World"));
        assertFalse(file2.containsSubstring("Hello World", "Goodbye"));
    }

    @Test
    public void testConcatenateIntegers() {
        File2 file2 = new File2();
        assertEquals("35", file2.concatenateIntegers(3, 5));
        assertEquals("00", file2.concatenateIntegers(0, 0));
    }

    @Test(expected = Exception.class)
    public void testThrowException() throws Exception {
        File2 file2 = new File2();
        file2.throwException();
    }
}

