package Recursion;

import java.util.Scanner;

public class FactorialNum {
    public static int factorialNum(int num)
    {
        if(num == 0 || num == 1)
        {
            return 1;
        }
        else
        {
            return num*factorialNum(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for which you want factorial: ");
        int num = scan.nextInt();
        int result = factorialNum(num);
        System.out.println("The factorial of number "+num+" is : "+result);
    }
}
