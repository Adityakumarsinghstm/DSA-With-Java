package Recursion;

import java.util.Scanner;

public class FindPowerOptimised {
    public static long powerOfElement(int a, int b) {
        long result, finalResult;
        if (b == 1) {
            return a;
        } else {
            result = powerOfElement(a, b / 2);
            finalResult = result * result;
            if(b%2==0)
            {
                return  finalResult;
            }else{
                return finalResult*a;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number with power");
        int num = scan.nextInt();
        int pnum = scan.nextInt();
        long result = powerOfElement(num, pnum);
        System.out.println("Answer is : "+ result);
    }
}
