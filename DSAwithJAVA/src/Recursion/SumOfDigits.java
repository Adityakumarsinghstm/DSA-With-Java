package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int nums)
    {
        if(nums == 0)
        {
            return nums;
        }
        else
        {
            return nums % 10 + sumOfDigits(nums / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("The sum of digits of number "+num+ " is : "+result);
    }
}
