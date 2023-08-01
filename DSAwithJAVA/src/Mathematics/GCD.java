package Mathematics;

public class GCD {
    public static int findGCD(int a, int b)
    {
        int res = Math.min(a,b);
        while (res>0)
        {
            if(a%res == 0 && b%res == 0)
            {
                break;
            }
            res --;
        }
        return res;
    }

    //Euclidian algorithm

    public static int findGCDusingUclidian(int a, int b)
    {
        while (a != b)
        {
            if(a>b)
            {
                a = a-b;
            }
            else
            {
                b = b-a;
            }
        }
        return a;
    }

    //Optimized approach of Euclidian algorithm
    public static int findGCDUclidian(int x, int y)
    {
        if(y==0)
        {
            return x;
        }
        else
        {
          return    findGCDUclidian(y, x%y);
        }
    }
    public static void main(String[] args) {
        int a =10;
        int b = 15;
        int ans = findGCDUclidian(a,b);
        System.out.println(ans);
    }
}
