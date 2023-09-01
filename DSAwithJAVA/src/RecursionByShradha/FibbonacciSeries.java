package RecursionByShradha;

import java.util.Scanner;

public class FibbonacciSeries {
    public static int calFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return calFib(n - 2) + calFib(n - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate fibonacci : ");
        int n =  scan.nextInt();
        int ans = calFib(n);
        System.out.println(ans);
    }
}
