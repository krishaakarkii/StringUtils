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


@Test
public void testFibonacciRecursiveAdditional() {
    File8 file8 = new File8();
    assertEquals(2, file8.fibonacciRecursive(3));
    assertEquals(3, file8.fibonacciRecursive(4));
    assertEquals(5, file8.fibonacciRecursive(5));
    assertEquals(8, file8.fibonacciRecursive(6));
    assertEquals(13, file8.fibonacciRecursive(7));
}

@Test
public void testReverseStringAdditional() {
    File8 file8 = new File8();
    assertEquals("tset", file8.reverseString("test"));
    assertEquals("gnirts", file8.reverseString("string"));
    assertEquals("1", file8.reverseString("1"));
    assertEquals("21", file8.reverseString("12"));
    assertEquals(null, file8.reverseString(null));
}

@Test
public void testIsEvenAdditional() {
    File8 file8 = new File8();
    assertFalse(file8.isEven(3));
    assertTrue(file8.isEven(4));
    assertFalse(file8.isEven(-3));
    assertTrue(file8.isEven(-2));
}

@Test
public void testFactorialIterativeAdditional() {
    File8 file8 = new File8();
    assertEquals(720, file8.factorialIterative(6));
    assertEquals(5040, file8.factorialIterative(7));
    assertEquals(40320, file8.factorialIterative(8));
    assertEquals(3628800, file8.factorialIterative(10));
}

@Test
public void testIsLeapYearAdditional() {
    File8 file8 = new File8();
    assertFalse(file8.isLeapYear(2023));
    assertTrue(file8.isLeapYear(2028));
    assertFalse(file8.isLeapYear(2100));
    assertTrue(file8.isLeapYear(2400));
}

@Test
public void testSumOfDigitsAdditional() {
    File8 file8 = new File8();
    assertEquals(6, file8.sumOfDigits(123));
    assertEquals(10, file8.sumOfDigits(1234));
    assertEquals(15, file8.sumOfDigits(12345));
    assertEquals(21, file8.sumOfDigits(123456));
}







}

