/*Check if "Tech" presents in "University of Technology" or not. If yes, return its position. */
class SubstringCheck {
    public static void main(String[] args){
        String mainString = "University of Technology";
        String subString = "Tech";

        // Check if the substring exists in the main string
        int position = mainString.indexOf(subString);

        if (position != -1) {
            System.out.println("\"" + subString + "\" is present in \"" + mainString + "\" at position: " + position);
        } else {
            System.out.println("\"" + subString + "\" is not present in \"" + mainString + "\".");
        }
    } 
}