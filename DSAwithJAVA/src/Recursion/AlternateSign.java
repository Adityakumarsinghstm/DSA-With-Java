package Recursion;

import java.util.Scanner;

public class AlternateSign {
    public static int sumOfAlternate(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n%2==0)
        {
           return sumOfAlternate(n-1)-n;
        }
        else
            return sumOfAlternate(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to alternate sign sum");
        int num = sc.nextInt();
        int result = sumOfAlternate(num);
        System.out.println("the answer is :"+result);
    }
}
