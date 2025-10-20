import java.util.Scanner;

class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pw = sc.next();

        if (isValidPassword(pw)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        sc.close();
    }

    public static boolean isValidPassword(String pw) {
        int len = pw.length();

        // Rule 1: Check length
        if (len < 8 || len > 10) {
            System.out.println("Password length should be between 8-10 characters.");
            return false;
        }

        boolean hasUpper = false;
        boolean hasDigit = false;

        // Rule 2 & 3: Check each character
        for (int i = 0; i < len; i++) {
            char ch = pw.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("Password cannot contain special characters.");
                return false;
            }

            if (Character.isUpperCase(ch))
                hasUpper = true;
            if (Character.isDigit(ch))
                hasDigit = true;
        }

        // Rule 3: Must have at least one uppercase OR one digit
        if (!hasUpper && !hasDigit) {
            System.out.println("Password must contain at least one uppercase letter or one digit.");
            return false;
        }

        return true;
    }
}
