/* Write a program to do the following:
(i) To display the question “Who is the inventor of Java”?
(ii) To accept an answer.
(iii) To print “Good” and then stop, if the answer is correct.
(iv) To print “Try Again”, if the answer is wrong.
(v) To display the correct answer when the answer is wrong even at the third attempt and stop.*/
import java.util.Scanner;
public class InventorOfJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "James Gosling";
        int attempts = 0;
        boolean isCorrect = false;

    while (attempts < 3 && !isCorrect) {
            System.out.println("Who is the inventor of Java?");
            String userAnswer = scanner.nextLine().trim();
            if (userAnswer.equalsIgnoreCase(correctAnswer)) { //ignoring case differences
                System.out.println("Good");
                isCorrect = true;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Try Again");
                } else {
                    System.out.println("Try Again. The correct answer is: " + correctAnswer);
                }
            }
        }
        scanner.close();
    }
}