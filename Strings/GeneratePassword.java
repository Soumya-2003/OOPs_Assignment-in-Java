/*Generate password from initials of one’s first_name, middle_name, last_name and with the
last four digits of your roll_no.(if the middle name is not present, it won't come). */
import java.util.Scanner;
class PasswordGenerator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (first, middle, and last): ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        String rollNo = scanner.nextLine();

        // Split the name into parts
        String[] nameParts = fullName.trim().split(" ");
        // Extract initials
        StringBuilder initials = new StringBuilder();
        for(int i = 0; i < nameParts.length; i++){
            initials.append(nameParts[i].charAt(0));
        }

        String lastFourDigits = rollNo.length() >= 4 ? rollNo.substring(rollNo.length() - 4) : rollNo;

        String password = initials.toString() + lastFourDigits;

        System.out.println("Generated Password: " + password);
    }
}