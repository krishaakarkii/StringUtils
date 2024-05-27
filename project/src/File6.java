// File6.java

/**
 * Represents a sample class with multiple methods to be tested.
 *
 * <p>This class is used for demonstrating basic arithmetic operations.
 *
 * @version     2024.0527
 * @since       17.0
 * @author     krisha
 */
public class File6 {

    /**
     * Returns the sum of two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The sum of the two integers
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Returns the difference between two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The difference between the two integers
     */
    public int difference(int a, int b) {
        return a - b;
    }

    /**
     * Returns the product of two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The product of the two integers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns the result of dividing one integer by another.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of dividing a by b
     * @throws IllegalArgumentException if the denominator is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    /**
     * Checks if two integers are equal.
     *
     * @param a The first integer
     * @param b The second integer
     * @return true if a equals b, otherwise false
     */
    public boolean isEqual(int a, int b) {
        return a == b;
    }
}

