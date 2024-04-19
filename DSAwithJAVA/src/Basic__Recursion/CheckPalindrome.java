package Basic__Recursion;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int n = str.length();
//        int i = 0;
        for (int i = 0;i<n/2;i++)
        {
            if(str.charAt(i) == str.charAt(n-1))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "fqpkzwbp";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}
