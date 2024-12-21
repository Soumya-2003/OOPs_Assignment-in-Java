/*Count the frequency of every characters present in a String. */
import java.util.HashMap;
import java.util.Map;
class CharacterFrequency {
    public static void main(String[] args){
        String input = "Hello World";
        input = input.toLowerCase();
        // Use a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        // Loop through each character in the string
        for(char ch : input.toCharArray()){
            if (ch == ' ')  continue;
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }
    }
}