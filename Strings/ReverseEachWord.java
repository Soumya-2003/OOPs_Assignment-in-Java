/*Write a program to Reverse each word in a sentence*/
import java.util.Scanner;

public class ReverseEachWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		String[] array = sentence.split("\\s+");
		for(String word : array){
			StringBuilder word_sb = new StringBuilder(word);
			word_sb = word_sb.reverse();
			sb.append(word_sb.toString());
			sb.append(" ");
		}		
	
		System.out.println("Required Sentence: " + sb.toString());
	}
}