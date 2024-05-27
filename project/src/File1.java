/**
 * Represents a sample class with multiple methods to be tested.
 *
 * <p>This class is used for demonstrating basic functionality and exception handling.
 *
 * @version 2024.0527
 * @since 17.0
 * @author krisha karki
 */
public class File1 {
    private int value;

    /**
     * Method that sets the value.
     *
     * @param value The value to set
     */
    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = value;
    }

    /**
     * Method that gets the value.
     *
     * @return The current value
     */
    public int getValue() {
        return value;
    }

    /**
     * Method that returns a greeting message.
     *
     * @param name The name to greet
     * @return A greeting message
     */
    public String greet(String name) {
        return "Hello, " + name + "!";
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

    /**
     * Method that checks if a number is even.
     *
     * @param number The number to check
     * @return True if the number is even, false otherwise
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
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
        throw new Exception("Exception in File1");
    }
}

