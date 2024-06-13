package gr.aueb.cf.OOPProjects.excersizes.ch14;

public class UtilMain {
    public static void main(String[] args) {
        String inputString = "levels";
        System.out.println("Original string: " + inputString);

        // Testing reverseString method
        String reversedString = StringUtils.reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

        // Testing toUpperCase method
        String upperCaseString = StringUtils.toUpperCase(inputString);
        System.out.println("Uppercase string: " + upperCaseString);

        // Testing isPalindrome method
        boolean isPalindrome = StringUtils.isPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }



            // Test string length validation
            String testString = " ";
            System.out.println("String to validate: " + testString);
            boolean isValidLength = ValidationUtils.isValidLength(testString);
            System.out.println("Is valid string length? " + isValidLength);

            // Test number range validation
            double testNumber = 7.5; // Change this value to test different numbers
            System.out.println("Number to validate: " + testNumber);
            boolean isValidNumber = ValidationUtils.isValidNumber(testNumber);
            System.out.println("Is valid number? " + isValidNumber);

    }
}
