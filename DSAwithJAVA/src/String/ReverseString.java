package String;

public class ReverseString {
    public static void main(String[] args) {
        reverse3("Aditya");
    }
    public static void reverse(String input)
    {
        String ans = "";
        for (int i = 0; i < input.length(); i++) {
            ans = input.charAt(i)+ans;
        }
        System.out.println(ans);
    }

    public static void reverse2(String input)
    {
        StringBuilder ans = new StringBuilder(input) ;
        int n = ans.length();
        for (int i = 0; i < n/2; i++) {
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n-1-i);
            ans.setCharAt(i,lastChar);
            ans.setCharAt(n-1-i,firstChar);
        }
        System.out.println(ans.toString());
    }

    public static void reverse3(String input)
    {
        char[] ansArray = input.toCharArray() ;
        int n = ansArray.length;
        for (int i = 0; i < n/2; i++) {
            char firstChar = ansArray[i];
            char lastChar = ansArray[n-1-i];
            ansArray[i] =lastChar;
            ansArray[n-1-i] = firstChar;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ansArray[i]);
        }
    }

}
