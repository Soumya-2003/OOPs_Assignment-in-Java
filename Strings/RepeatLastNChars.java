/*Given a string and an int n, return a string made of n repetitions of the last n characters of the
string. You may assume that n is between 0 and the length of the string, inclusive.
(For example if the inputs are “Wipro” and 3, then the output should be “propropro”.) */
public class RepeatLastNChars{
    public static void main(String[] args){
        String inputString = "Wipro";
        int n = 3;
        String result = repeatLastNCharacters(inputString, n);
        System.out.println("Result: " + result);
    }

    static String repeatLastNCharacters(String str, int n){
        if (n < 0 || n > str.length()) {
            throw new IllegalArgumentException("n must be between 0 and the length of the string.");
        }
        String lastNChars = str.substring(str.length() - n);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }

        return result.toString();
    }
}