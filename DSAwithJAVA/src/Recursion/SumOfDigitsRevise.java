package Recursion;


import java.util.Scanner;

public class SumOfDigitsRevise {
    static int findSum(int num) {
        if (num == 0) {
            return num;
        }
        return num % 10 + findSum(num / 10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ans = findSum(num);
        System.out.println(ans);
    }
}
