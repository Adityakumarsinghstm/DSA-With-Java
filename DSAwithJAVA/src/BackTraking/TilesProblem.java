package BackTraking;

public class TilesProblem
{
    public static int getWays(int n)
    {
        //Base case
        if (n <= 3) {
            return n;
        }
        //Recursive call
        return getWays(n - 1) + getWays(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("for n=1 , total no of Ways = "+getWays(1));
        System.out.println("for n=2 , total no of Ways = "+getWays(2));
        System.out.println("for n=3 , total no of Ways = "+getWays(3));
        System.out.println("for n=4 , total no of Ways = "+getWays(4));
        System.out.println("for n=5 , total no of Ways = "+getWays(5));
    }
}
