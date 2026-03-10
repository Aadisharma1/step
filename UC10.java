import java.util.Scanner;

class NormalizedPalindrome {

    boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}

public class UseCaseNormalizedPalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        NormalizedPalindrome checker = new NormalizedPalindrome();

        if (checker.isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
