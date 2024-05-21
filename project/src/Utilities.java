/**
 * Contains utility methods for common tasks.
 *
 * <p>This class provides various utility methods that are commonly used in applications.
 * 
 * @author      Krisha Karki
 * @version     2024.05.22
 * @since       17.0
 */
public class Utilities {

    /**
     * Returns the factorial of the given number.
     *
     * @param n the number
     * @return the factorial of the number
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Checks if a number is prime.
     *
     * @param n the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
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

    // Additional utility methods
}

