package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class BigPowerFind {
    public static BigInteger powerFind(BigInteger a, int b)
    {
        BigInteger result , finalResult;
        if(b==1)
        {
            return a;
        }
        else
        {
            result = powerFind(a, b/2);
            finalResult = result.multiply(result);
            if(b%2 == 0)
            {
                return finalResult;
            }
            else
            {
                return a.multiply(finalResult);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a and b");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        BigInteger result = powerFind(a,b);
        System.out.println("The power of "+a+ " and "+b+ " : "+result);

    }
}
