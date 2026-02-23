public class PalindroneCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker App Management System");
        String input = "madam";

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        //result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        System.out.println("Usecase 2 completed");

    }
}
