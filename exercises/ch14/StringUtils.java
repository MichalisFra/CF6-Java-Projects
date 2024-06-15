package gr.aueb.cf.OOPProjects.exercises.ch14;

public class StringUtils {

    private StringUtils() {

    }

    /**
     * Reverses the inserted String, by turning it into a StringBuilder
     * and utilizing reverse()
     * @param string
     * @return
     */
    public static String reverseString (String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input must not be null");
        }

        StringBuilder reversed = new StringBuilder(string);

        return reversed.reverse().toString();
    }

    /**
     * Transform the inserted String to Upper Case
     * @param string
     * @return
     */
    public static String toUpperCase(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input must not be null");
        }

        return string.toUpperCase();
    }

    /**
     * Checks if the inserted String is a palindrome
     * @param string
     * @return
     */
    public static boolean isPalindrome(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Input must not be null");
        }

        StringBuilder strb = new StringBuilder(string);

        int left = 0;
        int right = strb.length() -1;

        while (left < right) {
            if (strb.charAt(left) != strb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
