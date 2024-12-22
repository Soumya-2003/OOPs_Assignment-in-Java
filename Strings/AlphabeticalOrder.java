/*Write a program in Java which will read a string and rewrite it in the alphabetical order. For
example, the word STRING should be written as GINRST. */
import java.util.Scanner;
import java.util.Arrays;
public class AlphabeticalOrder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Convert the string to a character array
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("String in alphabetical order: " + sortedString);
    }
}