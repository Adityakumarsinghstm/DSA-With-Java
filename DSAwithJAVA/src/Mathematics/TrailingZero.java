package Mathematics;

public class TrailingZero {
    public static int findFact(int y)
    {
        int temp = y;
        int result = 1;

        for (int i = 2; i <=y ; i++) {
            result = result *i;
        }
        return  result;
    }
    public static int trailZero(int y)
    {
        int count = 0;
        int ans = findFact(y);
        while (ans %10 == 0)
        {
            count ++;
            ans= ans/10;
        }
        return count;
    }
    //Optimize approach
    public static int findTrailZero(int num)
    {
        int result = 0;
        for (int i = 5; i <=num ; i=i*5) {
            result = result + num/i;
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 100;
        int ans = findTrailZero(x);
        System.out.println(ans);
    }
}
