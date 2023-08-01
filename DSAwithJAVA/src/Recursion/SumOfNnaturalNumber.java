package Recursion;

public class SumOfNnaturalNumber {

    static int fun(int n)
    {
        int  sum =0;
        if(n==0)
        {
            return 0;
        }
        else
        {
           return n+fun(n-1);
        }
    }
    public static void main(String[] args) {
        int result = fun(5);
        System.out.println(result);
    }
}
