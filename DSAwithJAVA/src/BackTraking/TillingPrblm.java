package BackTraking;

public class TillingPrblm {
    public static int getWays(int n)
    {
        if(n<=3)
        {
            return n;
        }
        return getWays(n - 1) + getWays(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("For n=1, total ways = " +getWays(1));
        System.out.println("For n=2, total ways = " +getWays(2));
        System.out.println("For n=5, total ways = " +getWays(5));
    }
}
