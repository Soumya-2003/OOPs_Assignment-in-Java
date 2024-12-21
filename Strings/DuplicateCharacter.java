/*Find duplicate characters from a String. */
import java.util.HashMap;
import java.util.Map;
class DuplicateCharacters{
    public static void main(String[] args) {
        String input = "programming";
        input = input.toLowerCase();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}