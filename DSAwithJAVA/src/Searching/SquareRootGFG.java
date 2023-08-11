package Searching;

public class SquareRootGFG {
    static int findSqrRoot(int x)
    {
       int low = 1, high = x, ans = -1;
       while (low<=high)
       {
           int mid = low+(high-low)/2;
           int mysqr = mid*mid;
           if(mysqr == x)
           {
               return mid;
           }
           else if(mysqr>x)
           {
               high = mid-1;
           }
           else {
               low = mid+1;
               ans = mid;
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        int x = 25;
        int ans = findSqrRoot(x);
        System.out.println(ans);
    }
}
