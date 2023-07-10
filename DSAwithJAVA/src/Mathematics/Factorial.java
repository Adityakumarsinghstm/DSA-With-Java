package Mathematics;

public class Factorial {
    //Interative appraoch
    public static int findFactorial(int x)
    {
        int result = 1;
        while (x!=0)
        {
            result = result * x;
            x--;
        }
        return result;
    }


    //Recursive approach
    public static  int findFactorialUsingRecursion(int num){
        int temp = num;
        int result = 1;
        if(temp==0||temp==1)
        {
            return 1;
        }
        result = num*findFactorialUsingRecursion(temp-1);
        return result;

    }
    public static void main(String[] args) {
        int x = 5;
//        int ans = findFactorial(x);
        int ans = findFactorialUsingRecursion(x);
        System.out.println(ans);
    }
}
