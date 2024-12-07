// File3Test.java
package test;
import src.File3;
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
@Test
public void testGetStringLengthMore() {
    File3 file3 = new File3();
    assertEquals(11, file3.getStringLength("Hello World"));
    assertEquals(13, file3.getStringLength("Hello, World!"));
}

@Test
public void testToUpperCaseMore() {
    File3 file3 = new File3();
    assertEquals("HELLO WORLD", file3.toUpperCase("Hello World"));
    assertEquals("HELLO, WORLD!", file3.toUpperCase("Hello, World!"));
}

@Test
public void testContainsSubstringMore() {
    File3 file3 = new File3();
    assertTrue(file3.containsSubstring("Hello World", "Hello"));
    assertFalse(file3.containsSubstring("Hello World", "hello"));
}

@Test
public void testConcatenateIntegersMore() {
    File3 file3 = new File3();
    assertEquals("710", file3.concatenateIntegers(7, 10));
    assertEquals("56", file3.concatenateIntegers(5, 6));
}

@Test(expected = Exception.class)
public void testThrowExceptionMore() throws Exception {
    File3 file3 = new File3();
    file3.throwException();
}
}
