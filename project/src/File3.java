// File3.java

/**
 * Represents a sample class with multiple methods to be tested.
 *
 * <p>This class is used for demonstrating basic functionality and exception handling.
 *
 * @version     2024.0527
 * @since       17.0
 * @author     krisha karki
 */
public class File3 {

    /**
     * Method that returns the length of a string.
     *
     * @param str The input string
     * @return The length of the string
     */
    public int getStringLength(String str) {
        return str.length();
    }

    /**
     * Method that converts a string to uppercase.
     *
     * @param str The input string
     * @return The string converted to uppercase
     */
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    /**
     * Method that checks if a string contains a specific substring.
     *
     * @param str The input string
     * @param substr The substring to check
     * @return True if the string contains the substring, false otherwise
     */
    public boolean containsSubstring(String str, String substr) {
        return str.contains(substr);
    }

    /**
     * Method that concatenates two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The concatenated integer as a string
     */
    public String concatenateIntegers(int a, int b) {
if (a == 0 && b == 0) {
        return "0";
    }
    return String.valueOf(a) + String.valueOf(b);

    }

    /**
     * Method that throws an exception for testing purposes.
     *
     * @throws Exception when the method is called
     */
    public void throwException() throws Exception {
        throw new Exception("Exception in File3");
    }
}

