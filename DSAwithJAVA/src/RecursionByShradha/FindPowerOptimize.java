package RecursionByShradha;

public class FindPowerOptimize {
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = calPower(x, n / 2);
        int halfPowerSqr = halfPower * halfPower;
        if (n % 2 == 0) {
            return halfPowerSqr;
        }
        else{
            return x*halfPowerSqr;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calPower(x, n );
        System.out.println(ans);
    }
}
