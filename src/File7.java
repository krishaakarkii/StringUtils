// File7.java

/**
 * Represents a sample class with multiple methods to be tested.
 *
 * <p>This class is used for demonstrating basic functionality and exception handling.
 *
 * @version     2024.0527
 * @since       17.0
 * @author     krisha
 */
public class File7 {

    /**
     * Method that returns the maximum of two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The maximum of the two integers
     */
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Method that calculates the factorial of a non-negative integer.
     *
     * @param n The non-negative integer
     * @return The factorial of the integer
     * @throws IllegalArgumentException if the input is negative
     */
    public int factorial(int n) {
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
     * Method that checks if a given number is prime.
     *
     * @param n The number to check
     * @return True if the number is prime, false otherwise
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method that concatenates two strings.
     *
     * @param str1 The first string
     * @param str2 The second string
     * @return The concatenated string
     */
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    /**
     * Method that throws an exception for testing purposes.
     *
     * @throws Exception when the method is called
     */
    public void throwException() throws Exception {
        throw new Exception("Exception in File7");
    }
}

