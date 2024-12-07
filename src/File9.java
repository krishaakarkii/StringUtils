// File9.java

/**
 * This class contains various mathematical methods.
 */
package src;
public class File9 {

    /**
     * Calculates the nth Fibonacci number recursively.
     *
     * @param n The index of the Fibonacci number to calculate
     * @return The nth Fibonacci number
     */
    public int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * Calculates the nth Fibonacci number iteratively.
     *
     * @param n The index of the Fibonacci number to calculate
     * @return The nth Fibonacci number
     */
    public int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    /**
     * Checks if a given number is a perfect square.
     *
     * @param num The number to check
     * @return True if the number is a perfect square, false otherwise
     */
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    /**
     * Calculates the factorial of a given number recursively.
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of the given number
     */
    public long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Calculates the factorial of a given number iteratively.
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of the given number
     */
    public long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

