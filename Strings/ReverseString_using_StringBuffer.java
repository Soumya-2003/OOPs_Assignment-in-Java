/*Write program 4 using StringBuffer. */
import java.util.Scanner;
class StringReverseWithStringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string using StringBuffer
        String reversedString = reverse(inputString);
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }

    static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
