/*Create a class containing some public and private data and having one public method.
Access private data from outside the class after satisfying some criteria of the public method. */
class SecureData{
    private String secretData = "Top Secret Data";
    public String getSecretData(String password) {
        if (password.equals("secure123")) {
            return secretData;
        } else {
            return "Access Denied: Incorrect Password!";
        }
    }
}
class Main {
    public static void main(String[] args) {
        SecureData secure = new SecureData();
        System.out.println("Attempt with wrong password:");
        String response1 = secure.getSecretData("wrongpassword");
        System.out.println(response1);

        System.out.println("Attempt with correct password:");
        String response2 = secure.getSecretData("secure123");
        System.out.println(response2);
    }
}