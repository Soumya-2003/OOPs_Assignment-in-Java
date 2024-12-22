/*Create two strings s1 and s2 from user input, create another String s3 that contains one
character from s1 and another character from s2. */
import java.util.Scanner;
public class StringMerge{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string (s1): ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string (s2): ");
        String s2 = scanner.nextLine();

        StringBuilder s3 = new StringBuilder();
        int minLength = Math.min(s1.length(), s2.length());

        // Add alternating characters from s1 and s2
        for (int i = 0; i < minLength; i++) {
            s3.append(s1.charAt(i));
            s3.append(s2.charAt(i));
        }

        // Append remaining characters if s1 or s2 is longer
        if (s1.length() > minLength) {
            s3.append(s1.substring(minLength));
        } else if (s2.length() > minLength) {
            s3.append(s2.substring(minLength));
        }

        System.out.println("The merged string (s3) is: " + s3.toString());
    }
}