// File8.java

/**
 * Represents a sample class with multiple methods to be tested.
 *
 * <p>This class is used for demonstrating basic functionality and exception handling.
 *
 * @version     2024.0527
 * @since       17.0
 * @author     krisha
 */
public class File8 {

    /**
     * Method that checks if a given string is palindrome.
     *
     * @param str The string to check
     * @return True if the string is palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method that calculates the nth Fibonacci number recursively.
     *
     * @param n The index of the Fibonacci number
     * @return The nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public int fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * Method that reverses a given string.
     *
     * @param str The string to reverse
     * @return The reversed string
     */
    public String reverseString(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    /**
     * Method that checks if a given number is even.
     *
     * @param num The number to check
     * @return True if the number is even, false otherwise
     */
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Method that calculates the factorial of a non-negative integer iteratively.
     *
     * @param n The non-negative integer
     * @return The factorial of the integer
     * @throws IllegalArgumentException if the input is negative
     */
    public int factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Method that checks if a given year is a leap year.
     *
     * @param year The year to check
     * @return True if the year is a leap year, false otherwise
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Method that calculates the sum of all digits in a given number.
     *
     * @param num The number
     * @return The sum of all digits
     */
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

