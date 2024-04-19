package Basic__Recursion;

import java.util.ArrayList;
import java.util.List;

public class FactorialNumbersNotGreaterThanN {
    public static long findFactorial(long n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*findFactorial(n-1);
    }
    public static List<Long> factorialNumbers(long n){
        ArrayList<Long> ans = new ArrayList<>();
        int p=1;
        while (findFactorial(p)<=n)
        {
            ans.add((long)findFactorial(p));
            p++;
        }
        return ans;
    }
    public static void main(String[] args) {
       List<Long> ans = factorialNumbers(2);
        for (long n:ans ) {
            System.out.println(n);
        }

    }
}
