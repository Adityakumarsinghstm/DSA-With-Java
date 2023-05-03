package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static int findFibonacci(int num)
    {
        int result;
        if(num == 0 || num == 1)
        {
            return num;
        }
        else
        {
             result = findFibonacci(num - 1) + findFibonacci(num - 2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want fibonacci: ");
        int num = scan.nextInt();
        int result =  findFibonacci(num);
        System.out.println("Fibonacci of "+num +" is : "+result);
    }
}
