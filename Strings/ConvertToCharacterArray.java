/*Take a string from the keyboard and convert it into a character array (new one). */
import java.util.Scanner;
class StringToCharArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        System.out.println("Character array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        scanner.close();
    }   
}