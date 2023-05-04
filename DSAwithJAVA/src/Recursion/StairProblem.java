package Recursion;

import java.util.Scanner;

public class StairProblem {
    public static int findWay(int n)
    {
        int count =0;
        if (n <= 1) {
            return n;
        } else {
            return count = findWay(n - 1) + findWay(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scan.nextInt();
        int result = findWay(num + 1);
        System.out.println("the number of ways is :"+ result);
    }
}
