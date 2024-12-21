/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are
“Mark” and “Kate” then the ouput should be “markate”. */
class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "com";
        String str2 = "mputer";
        String result = concatenateStrings(str1, str2);
        System.out.println("Result: " + result);
    }

    static String concatenateStrings(String str1, String str2) {
        // Check if the last character of str1 is the same as the first character of str2
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            // If they are the same, concatenate without the first character of str2
            return str1 + str2.substring(1);
        } else {
            // Otherwise, simply concatenate both strings
            return str1 + str2;
        }
    }
}
