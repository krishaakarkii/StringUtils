/**
 * Represents a sample class with multiple methods to be tested.
 *
 * <p>This class is used for demonstrating basic functionality and exception handling.
 *
 * @version     2024.0527
 * @since       17.0
 * @author     krisa karki
 */
package src;
public class File4 {

    /**
     * Method that calculates the factorial of a number.
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of the number
     * @throws IllegalArgumentException if the number is negative
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Method that divides two integers.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     * @throws ArithmeticException if the denominator is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    /**
     * Method that checks if a number is prime.
     *
     * @param n The number to check
     * @return True if the number is prime, false otherwise
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method that checks if a string is palindrome.
     *
     * @param str The string to check
     * @return True if the string is palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
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
     * Method that calculates the square of a number.
     *
     * @param number The number to square
     * @return The square of the number
     */
    public int square(int number) {
        return number * number;
    }
}

