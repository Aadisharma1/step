import java.util.Scanner;

class RecursivePalindrome {

    boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }
}

public class UseCaseRecursivePalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String input = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        RecursivePalindrome checker = new RecursivePalindrome();

        boolean result = checker.isPalindrome(input, 0, input.length() - 1);

        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
