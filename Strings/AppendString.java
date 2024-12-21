/*Take a string from the keyboard and a char array (of length 5). Now append the string to that char array. */
import java.util.Scanner;
class AppendStringToCharArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        char[] charArray = new char[5];
        System.out.println("Enter 5 characters for the char array:");
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        // Convert the char array to a string
        String charArrayAsString = new String(charArray);

        // Append the input string to the char array string
        String result = charArrayAsString + inputString;

        System.out.println("Appended String: " + result);
        scanner.close();
    }
}