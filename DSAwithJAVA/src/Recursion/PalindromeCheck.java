package Recursion;

import java.util.Scanner;

public class PalindromeCheck {
    static boolean checkPalindrome(String str, int start, int end) {
        if (start <= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && checkPalindrome(str, start + 1, end - 1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string for checking Palindrome : ");
        String str = scan.next();
        boolean ans = checkPalindrome(str, 0, str.length());
        System.out.println(ans);
    }
}
