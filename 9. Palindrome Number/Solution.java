import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers & numbers ending with 0 (except 0 itself) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        // Reverse half of the number
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        // Check for even length & odd length numbers
        return (x == rev || x == rev / 10);
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int num = 121; // try different values
        if (obj.isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}
