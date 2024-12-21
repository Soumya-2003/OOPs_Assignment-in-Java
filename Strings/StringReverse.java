/*Write a java program to perform String Reverse. */
import java.util.Scanner;
class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = reverse(inputString);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Method to reverse the string
    static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
