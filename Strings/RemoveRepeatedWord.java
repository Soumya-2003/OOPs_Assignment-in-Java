/*Write a program to remove repeated words in a string and ascending order of word length*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class RemoveRepeatedWord{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String input = sc.nextLine();
		String[] words = input.split("\\s+");
		Map<String, Integer> mp = new HashMap<>();
		for(String word : words){
			mp.put(word, word.length());
		}
		StringBuilder sb = new StringBuilder();
		List<Map.Entry<String, Integer>> wordList = new ArrayList<>(mp.entrySet());
		wordList.sort(Map.Entry.comparingByValue());
		for(Map.Entry<String, Integer> word : wordList){
			sb.append(word.getKey()).append(" ");
			
		}
		
		System.out.println("Ouput String: " + sb.toString());
	}
}