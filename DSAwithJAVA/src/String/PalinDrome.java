package String;

public class PalinDrome {
    public static void main(String[] args) {
       boolean result = checkPalinDrome("AKMKA");
        System.out.println(result);
    }
    public static boolean checkPalinDrome(String input)
    {
        StringBuilder ans = new StringBuilder(input);
        int n = ans.length();
        boolean res = true;
        for (int i = 0; i < n/2; i++) {
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n-1-i);
            if(firstChar != lastChar)
            {
                res = false;
                break;
            }
        }
        return res;
    }
}
