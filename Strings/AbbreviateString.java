/*Take input a name using command line and print it in abbreviated format.
(e.g. Input: Amit Kumar Das Output: A.K.Das) */
class AbbreviateName {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a name as a command line argument.");
            return;
        }

        // Join the command line arguments to form the full name
        String fullName = String.join(" ", args);
        
        // Split the full name into parts (assuming words are separated by spaces)
        String[] nameParts = fullName.split(" ");

        // Initialize a StringBuilder to store the abbreviated name
        StringBuilder abbreviatedName = new StringBuilder();

        // Loop through all parts except the last one
        for (int i = 0; i < nameParts.length - 1; i++) {
            abbreviatedName.append(nameParts[i].charAt(0)).append(".");  // First letter followed by dot
        }

        // Add the last name as it is
        abbreviatedName.append(nameParts[nameParts.length - 1]);

        // Output the abbreviated name
        System.out.println("Abbreviated Name: " + abbreviatedName.toString());
    }
}
