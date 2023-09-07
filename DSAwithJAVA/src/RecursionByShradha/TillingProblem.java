package RecursionByShradha;

import java.util.Scanner;

public class TillingProblem {
    public static int tillingWay(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tillingWay(n - 1) + tillingWay(n - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = tillingWay(n);
        System.out.println(ans);
    }
}
