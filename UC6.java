import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "rotator";
        
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Stack (LIFO) vs Queue (FIFO) Comparison");
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
