import java.util.*;

public class PalindroneCheckerApp {
    public static void main(String[] args){
        String input = "level";   // You can change this for testing

        System.out.println("Input : " + input);
        System.out.println("-----------------------------------");

        // Approach 1: Reverse String Method
        long startTime1 = System.nanoTime();
        boolean result1 = isPalindromeUsingReverse(input);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // Approach 2: Two-Pointer Method
        long startTime2 = System.nanoTime();
        boolean result2 = isPalindromeUsingTwoPointers(input);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        // Display results
        System.out.println("Reverse Method:");
        System.out.println("Is Palindrome? : " + result1);
        System.out.println("Execution Time : " + duration1 + " ns");

        System.out.println();

        System.out.println("Two-Pointer Method:");
        System.out.println("Is Palindrome? : " + result2);
        System.out.println("Execution Time : " + duration2 + " ns");

        System.out.println("-----------------------------------");

        // Compare performance
        if (duration1 < duration2) {
            System.out.println("Reverse Method is faster.");
        } else if (duration2 < duration1) {
            System.out.println("Two-Pointer Method is faster.");
        } else {
            System.out.println("Both methods have equal performance.");
        }
    }

    /**
     * Palindrome check using String reversal.
     */
    public static boolean isPalindromeUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    /**
     * Palindrome check using two-pointer technique.
     */
    public static boolean isPalindromeUsingTwoPointers(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}