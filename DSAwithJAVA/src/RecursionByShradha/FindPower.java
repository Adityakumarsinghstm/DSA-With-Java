package RecursionByShradha;

public class FindPower {
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * calPower(x, n - 1);
    }
    public static void main(String[] args) {
        int x =2;
        int n=5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
