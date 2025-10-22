// Remove Duplicate Characters from a String
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class RemoveDuplicateChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		Map<Character, Boolean> mp = new HashMap<>();
		for(char ch : str.toCharArray()){
			if(!mp.containsKey(ch)){
				mp.put(ch, true);
				sb.append(ch);
			}
		}
		str = sb.toString();
		System.out.println("After Removing Duplicates: " + str);
	}
}