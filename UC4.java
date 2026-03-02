public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "racecar";
        char[] charArray = input.toCharArray();
        
        boolean isPalindrome = checkPalindrome(charArray);

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static boolean checkPalindrome(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
