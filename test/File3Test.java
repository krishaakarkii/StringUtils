// File3Test.java

import static org.junit.Assert.*;
import org.junit.Test;

public class File3Test {

    @Test
    public void testGetStringLength() {
        File3 file3 = new File3();
        assertEquals(5, file3.getStringLength("Hello"));
        assertEquals(0, file3.getStringLength(""));
    }

    @Test
    public void testToUpperCase() {
        File3 file3 = new File3();
        assertEquals("HELLO", file3.toUpperCase("hello"));
        assertEquals("", file3.toUpperCase(""));
    }

    @Test
    public void testContainsSubstring() {
        File3 file3 = new File3();
        assertTrue(file3.containsSubstring("Hello World", "World"));
        assertFalse(file3.containsSubstring("Hello World", "Goodbye"));
    }

    @Test
    public void testConcatenateIntegers() {
        File3 file3 = new File3();
        assertEquals("35", file3.concatenateIntegers(3, 5));
        assertEquals("0", file3.concatenateIntegers(0, 0));
    }

    @Test(expected = Exception.class)
    public void testThrowException() throws Exception {
        File3 file3 = new File3();
        file3.throwException();
    }
}

