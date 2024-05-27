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
}

