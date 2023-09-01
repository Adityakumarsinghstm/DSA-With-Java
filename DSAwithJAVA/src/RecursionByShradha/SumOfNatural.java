package RecursionByShradha;

import java.util.Scanner;

public class SumOfNatural {
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calculateSum(n - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate the sum ");
        int n = scan.nextInt();
        int ans = calculateSum(n);
        System.out.println("The total sum is : "+ans);
    }
}
