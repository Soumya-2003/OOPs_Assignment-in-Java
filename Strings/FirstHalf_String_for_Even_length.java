/*Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the
string length is an odd number then return null. */
import java.util.Scanner;
class FirstHalfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (input.length() % 2 == 0) {
            // Return the first half
            String firstHalf = input.substring(0, input.length() / 2);
            System.out.println("First half of the string: " + firstHalf);
        } else {
            System.out.println("The string length is odd. Returning: null");
        }
    }
}