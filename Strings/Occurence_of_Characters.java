/*Count the number of characters which are occurring two times in a String. */
import java.util.HashMap;
import java.util.Map;
class CountCharactersWithTwoOccurrences {
    public static void main(String[] args){
        String input = "programming";
        input.toLowerCase();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char ch : input.toCharArray()){
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
        }

        // Count characters that occur exactly two times
        int count = 0;
        for(int frequency : frequencyMap.values()){
            if (frequency == 2) {
                count++;
            }
        }
        System.out.println(frequencyMap);
        System.out.println("Number of characters occurring exactly two times: " + count);
    }
}