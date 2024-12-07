package test;
import src.File10;
import org.junit.Test;
import static org.junit.Assert.*;

public class File10Test {

    @Test
    public void testConcatenateWithSpace() {
        File10 file10 = new File10();
        assertEquals("Hello World", file10.concatenateWithSpace("Hello", "World"));
        assertEquals("Open AI", file10.concatenateWithSpace("Open", "AI"));
        assertEquals("Java Programming", file10.concatenateWithSpace("Java", "Programming"));
    }

    @Test
    public void testIsPalindrome() {
        File10 file10 = new File10();
        assertTrue(file10.isPalindrome("radar"));
        assertTrue(file10.isPalindrome("level"));
        assertTrue(file10.isPalindrome("madam"));
        assertFalse(file10.isPalindrome("hello"));
        assertFalse(file10.isPalindrome("world"));
    }

    @Test
    public void testCountWords() {
        File10 file10 = new File10();
        assertEquals(1, file10.countWords("Hello"));
        assertEquals(2, file10.countWords("Hello World"));
        assertEquals(3, file10.countWords("Welcome to Java"));
        assertEquals(4, file10.countWords("This is a sentence"));
    }

    @Test
    public void testReverseString() {
        File10 file10 = new File10();
        assertEquals("dlrow olleH", file10.reverseString("Hello world"));
        assertEquals("olleH", file10.reverseString("Hello"));
        assertEquals("gnimmargorP avaJ", file10.reverseString("Java Programming"));
    }

    @Test
    public void testToUpperCase() {
        File10 file10 = new File10();
        assertEquals("HELLO", file10.toUpperCase("hello"));
        assertEquals("WORLD", file10.toUpperCase("world"));
        assertEquals("JAVA", file10.toUpperCase("Java"));
    }
     @Test
public void testConcatenateWithSpaceAdditional() {
    File10 file10 = new File10();
    assertEquals("Test String", file10.concatenateWithSpace("Test", "String"));
    assertEquals("Hello Java", file10.concatenateWithSpace("Hello", "Java"));
    assertEquals("JUnit Testing", file10.concatenateWithSpace("JUnit", "Testing"));
    assertEquals(" ", file10.concatenateWithSpace("", ""));
    assertEquals("Hello ", file10.concatenateWithSpace("Hello", ""));
    assertEquals(" Hello", file10.concatenateWithSpace("", "Hello"));
}

@Test
public void testIsPalindromeAdditional() {
    File10 file10 = new File10();
    assertTrue(file10.isPalindrome("racecar"));
    assertTrue(file10.isPalindrome("deed"));
    assertTrue(file10.isPalindrome("civic"));
    assertFalse(file10.isPalindrome("palindrome"));
    assertFalse(file10.isPalindrome("test"));
    assertTrue(file10.isPalindrome("a"));
    assertFalse(file10.isPalindrome(""));
}

@Test
public void testCountWordsAdditional() {
    File10 file10 = new File10();
    assertEquals(5, file10.countWords("This is a test string"));
    assertEquals(3, file10.countWords("One Two Three"));
    assertEquals(1, file10.countWords("Single"));
    assertEquals(0, file10.countWords(""));
}


@Test
public void testToUpperCaseAdditional() {
    File10 file10 = new File10();
    assertEquals("TEST", file10.toUpperCase("test"));
    assertEquals("STRING", file10.toUpperCase("string"));
    assertEquals("HELLO JAVA", file10.toUpperCase("Hello Java"));
    assertEquals("JUNIT TESTING", file10.toUpperCase("JUnit Testing"));
    assertEquals("", file10.toUpperCase(""));
}

@Test
public void testConcatenateWithSpaceMore() {
    File10 file10 = new File10();
    assertEquals("Java Programming", file10.concatenateWithSpace("Java", "Programming"));
    assertEquals("JUnit Testing", file10.concatenateWithSpace("JUnit", "Testing"));
    assertEquals("Hello World", file10.concatenateWithSpace("Hello", "World"));
}

@Test
public void testIsPalindromeMore() {
    File10 file10 = new File10();
    assertTrue(file10.isPalindrome("mom"));
    assertTrue(file10.isPalindrome("dad"));
    assertTrue(file10.isPalindrome("pop"));
    assertFalse(file10.isPalindrome("hello"));
    assertFalse(file10.isPalindrome("world"));
}

@Test
public void testCountWordsMore() {
    File10 file10 = new File10();
    assertEquals(4, file10.countWords("This is a test"));
    assertEquals(5, file10.countWords("JUnit is a testing framework"));
    assertEquals(3, file10.countWords("I love Java"));
}


@Test
public void testToUpperCaseMore() {
    File10 file10 = new File10();
    assertEquals("HELLO", file10.toUpperCase("hello"));
    assertEquals("WORLD", file10.toUpperCase("world"));
    assertEquals("JAVA PROGRAMMING", file10.toUpperCase("Java Programming"));
}
}
