/*Write a java program to check whether a String is Palindrome or not. */
import java.util.Scanner;
class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if the string is a palindrome
    static boolean isPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lowercase
        String cleanedString = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // Check if the string is equal to its reverse
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return cleanedString.equals(reversedString);
    }
}
