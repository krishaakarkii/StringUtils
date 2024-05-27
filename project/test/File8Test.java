// File8Test.java
package test;
import src.File8;
import static org.junit.Assert.*;
import org.junit.Test;

public class File8Test {

    @Test
    public void testIsPalindrome() {
        File8 file8 = new File8();
        assertTrue(file8.isPalindrome("radar"));
        assertTrue(file8.isPalindrome("level"));
        assertFalse(file8.isPalindrome("hello"));
        assertFalse(file8.isPalindrome("world"));
        assertTrue(file8.isPalindrome("racecar"));
    }

    @Test
    public void testFibonacciRecursive() {
        File8 file8 = new File8();
        assertEquals(0, file8.fibonacciRecursive(0));
        assertEquals(1, file8.fibonacciRecursive(1));
        assertEquals(1, file8.fibonacciRecursive(2));
        assertEquals(55, file8.fibonacciRecursive(10));
        assertEquals(233, file8.fibonacciRecursive(13));
    }

    @Test
    public void testReverseString() {
        File8 file8 = new File8();
        assertEquals("olleh", file8.reverseString("hello"));
        assertEquals("dlrow", file8.reverseString("world"));
        assertEquals("", file8.reverseString(""));
    }

    @Test
    public void testIsEven() {
        File8 file8 = new File8();
        assertTrue(file8.isEven(2));
        assertTrue(file8.isEven(0));
        assertFalse(file8.isEven(1));
        assertFalse(file8.isEven(-1));
        assertTrue(file8.isEven(-4));
    }

    @Test
    public void testFactorialIterative()
{
        File8 file8 = new File8();
        assertEquals(1, file8.factorialIterative(0));
        assertEquals(1, file8.factorialIterative(1));
        assertEquals(120, file8.factorialIterative(5));
        assertEquals(362880, file8.factorialIterative(9));
    }

    @Test
    public void testIsLeapYear() {
        File8 file8 = new File8();
        assertTrue(file8.isLeapYear(2024));
        assertTrue(file8.isLeapYear(2000));
        assertFalse(file8.isLeapYear(1900));
        assertFalse(file8.isLeapYear(2100));
    }

    @Test
    public void testSumOfDigits() {
        File8 file8 = new File8();
        assertEquals(0, file8.sumOfDigits(0));
        assertEquals(3, file8.sumOfDigits(12));
        assertEquals(15, file8.sumOfDigits(12345));
        assertEquals(45, file8.sumOfDigits(123456789));
    }
}

