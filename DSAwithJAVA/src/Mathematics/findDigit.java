package Mathematics;

public class findDigit {
    public static int findDigit(int x)
    {
        int count = 0;
        while (x>0)
        {
            x = x/10;
            count++;
        }
        return count;
    }
    //Using Recursion
    public static int findDigitUsingRecursion(int y)
    {
        int result = 0;
        if(y<=0)
        {
            return 0;
        }

             result = 1 + findDigitUsingRecursion(y/10);

        return result;
    }
    public static void main(String[] args) {
        int x = 2359;
//        int res = findDigit(x);
        int res = findDigitUsingRecursion(x);
        System.out.println(res);
    }
}
