// File10.java

/**
 * This class contains various string manipulation methods.
 */
public class File10 {

    /**
     * Concatenates two strings with a space in between.
     *
     * @param str1 The first string
     * @param str2 The second string
     * @return The concatenated string
     */
    public String concatenateWithSpace(String str1, String str2) {
        return str1 + " " + str2;
    }

    /**
     * Checks if a string is a palindrome.
     *
     * @param str The string to check
     * @return True if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * Counts the number of words in a string.
     *
     * @param str The input string
     * @return The number of words in the string
     */
    public int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    /**
     * Reverses a given string.
     *
     * @param str The string to reverse
     * @return The reversed string
     */
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    /**
     * Converts a string to uppercase.
     *
     * @param str The input string
     * @return The string converted to uppercase
     */
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}

