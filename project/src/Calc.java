/**
 * Represents a calculator for performing basic arithmetic operations.
 *
 * <p>This class provides methods for addition, subtraction, multiplication, and division.
 *
 * @author      Krisha Karki
 * @version     2024.05.18
 * @since       17.0
 */
public class Calc {

    /**
     * Adds two numbers together.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of the two numbers
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts one number from another.
     *
     * @param num1 the number to subtract from
     * @param num2 the number to subtract
     * @return the result of subtracting num2 from num1
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers together.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the product of the two numbers
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides one number by another.
     *
     * @param num1 the number to divide
     * @param num2 the number to divide by
     * @return the result of dividing num1 by num2
     * @throws ArithmeticException if attempting to divide by zero
     */
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

