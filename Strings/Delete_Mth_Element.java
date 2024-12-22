/*Write your own method called deleteMe (String str, int m) that returns the input string with
the mth element removed. */
class RemoveElement {
    public static void main(String[] args){
        String input = "HelloWorld";
        int m = 5;
        String result = deleteMe(input, m);
        System.out.println("Original String: " + input);
        System.out.println("String after removing " + m + "th character: " + result);
    }
    static String deleteMe(String str, int m){
        if (m < 0 || m >= str.length()) {
            throw new IllegalArgumentException("Invalid index: " + m);
        }
        // Use substring to exclude the m-th character
        return str.substring(0, m) + str.substring(m + 1);
    }
}