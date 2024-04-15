package Basic_Maths;

public class ReverseNumber {
    public static int reverseNum(int n)
    {
        int lastDigit;
        int revNum = 0;
        while(n!=0)
        {
            lastDigit = n%10;
            if((revNum > Integer.MAX_VALUE)||(revNum <Integer.MIN_VALUE))
            {
                return  0;
            }
            revNum = (revNum *10)+lastDigit;
            n = n/10;
        }
        return revNum;
    }
    public static void checkPalindrome()
    {
        int n = 111;
        int reversedNum = reverseNum(n);
        if(reversedNum == n)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
//        int ans = reverseNum(3453424);
//        System.out.println(ans);
        checkPalindrome();
    }
}
