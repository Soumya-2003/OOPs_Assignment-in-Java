/*Find length of a string taken from the keyboard and also find the length of that string except
front and end spaces. */
import java.util.Scanner;

class StringLengthExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int originalLength = inputString.length();

        // Calculate the length of the string excluding front and end spaces
        String trimmedString = inputString.trim(); // Removes leading and trailing spaces
        int trimmedLength = trimmedString.length();

        System.out.println("Original string length: " + originalLength);
        System.out.println("Length of string excluding front and end spaces: " + trimmedLength);

        scanner.close();
    }
}
