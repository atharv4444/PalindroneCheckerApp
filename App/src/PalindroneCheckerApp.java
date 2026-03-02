import java.util.*;

public class PalindroneCheckerApp {
    public static void main(String[] args){
        String input = "level";

        // Inject strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Pushing all characters onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Comparing by popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}