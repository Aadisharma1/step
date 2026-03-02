import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "radar";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Input: " + input);
        System.out.println("Reversed via Stack: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: Palindrome confirmed.");
        } else {
            System.out.println("Result: Not a palindrome.");
        }
    }
}
