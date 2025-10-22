// Display the frequency of characters in a String and remove the duplicates
import java.util.*;

public class FrequencyOfChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = sc.nextLine().toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		Map<Character, Integer> charFreq = new HashMap<>();
		for(char ch : str.toCharArray()){
			if(Character.isLetterOrDigit(ch)){
				int count = charFreq.getOrDefault(ch, 0) + 1;
				if(count==1)	sb.append(ch);
				charFreq.put(ch, count);
			}
		}

		for(Map.Entry<Character, Integer> chars : charFreq.entrySet()){
			System.out.println(chars.getKey() + "->" + chars.getValue());
		}
		System.out.println(charFreq);
		System.out.println("After removing duplicates: " + sb.toString());
	}
}