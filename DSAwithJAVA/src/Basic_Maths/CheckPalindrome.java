package Basic_Maths;

public class CheckPalindrome {
    public static void palindrome(int n)
    {

        int revNum = 0;
        int dup = n;
        while(n!=0)
        {
            int lastDigit = n%10;
            revNum = (revNum * 10) + lastDigit;
            n=  n/10;

        }
        if(dup == revNum)
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
      palindrome(1212);

    }
}
