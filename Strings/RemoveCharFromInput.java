// Remove characters from the input string
import java.util.Scanner;

public class RemoveCharFromInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a string: ");
		String sentence = sc.nextLine();

		System.out.print("Input Mask String: ");
		String maskString = sc.next();

		char[] chars = sentence.toCharArray();
		char[] masks = maskString.toCharArray();

		for(char ch : masks){
			//sentence = sentence.replaceAll((""+ch), "");
			sentence = sentence.replaceAll(String.valueOf(ch), "");
		}
		
		System.out.println("After removing maskString: " + sentence);
	}
}