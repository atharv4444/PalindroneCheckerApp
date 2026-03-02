import java.util.*;

public class PalindroneCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Normalize string
        // Remove all non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Apply palindrome logic (compare both ends)
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}