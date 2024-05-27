// File2Test.java

package test;
import src.File2;
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
     
     @Test
public void testGetStringLengthAdditional() {
    File2 file2 = new File2();
    assertEquals(11, file2.getStringLength("Hello World"));
    assertEquals(13, file2.getStringLength("Hello, World!"));
    assertEquals(0, file2.getStringLength(""));
    assertEquals(1, file2.getStringLength("a"));
}

@Test
public void testToUpperCaseAdditional() {
    File2 file2 = new File2();
    assertEquals("HELLO WORLD", file2.toUpperCase("Hello World"));
    assertEquals("HELLO, WORLD!", file2.toUpperCase("Hello, World!"));
    assertEquals("A", file2.toUpperCase("a"));
}

@Test
public void testContainsSubstringAdditional() {
    File2 file2 = new File2();
    assertTrue(file2.containsSubstring("Hello World", "Hello"));
    assertTrue(file2.containsSubstring("Hello, World!", "!"));
    assertFalse(file2.containsSubstring("Hello World", "hello"));
    assertFalse(file2.containsSubstring("Hello, World!", "world"));
}

@Test
public void testConcatenateIntegersAdditional() {
    File2 file2 = new File2();
    assertEquals("710", file2.concatenateIntegers(7, 10));
    assertEquals("105", file2.concatenateIntegers(10, 5));
    assertEquals("00", file2.concatenateIntegers(0, 0));
    assertEquals("1010", file2.concatenateIntegers(10, 10));
}

@Test(expected = Exception.class)
public void testThrowExceptionAdditional() throws Exception {
    File2 file2 = new File2();
    file2.throwException();
}
  
@Test
public void testGetStringLengthMore() {
    File2 file2 = new File2();
    assertEquals(6, file2.getStringLength("Coding"));
    assertEquals(4, file2.getStringLength("Test"));
    assertEquals(0, file2.getStringLength(""));
    assertEquals(1, file2.getStringLength("I"));
}

@Test
public void testToUpperCaseMore() {
    File2 file2 = new File2();
    assertEquals("CODING", file2.toUpperCase("Coding"));
    assertEquals("TEST", file2.toUpperCase("Test"));
    assertEquals("I", file2.toUpperCase("i"));
}

@Test
public void testContainsSubstringMore() {
    File2 file2 = new File2();
    assertTrue(file2.containsSubstring("Coding is fun", "fun"));
    assertTrue(file2.containsSubstring("JUnit Testing", "Test"));
    assertFalse(file2.containsSubstring("Hello World", "Goodbye"));
    assertFalse(file2.containsSubstring("Hello, World!", "world"));
}

@Test
public void testConcatenateIntegersMore() {
    File2 file2 = new File2();
    assertEquals("78", file2.concatenateIntegers(7, 8));
    assertEquals("56", file2.concatenateIntegers(5, 6));
    assertEquals("00", file2.concatenateIntegers(0, 0));
    assertEquals("1010", file2.concatenateIntegers(10, 10));
}

@Test(expected = Exception.class)
public void testThrowExceptionMore() throws Exception {
    File2 file2 = new File2();
    file2.throwException();
}
}     
