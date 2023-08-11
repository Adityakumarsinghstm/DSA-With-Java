package Searching;

public class CountOnes {
    static int findOccur(int[] arr)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<= high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==0)
            {
                low = mid+1;
            }
            else
            {
                if(mid == 0 || arr[mid] != arr[mid-1])
                {
                    return n-mid;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int ans = findOccur(arr);
        System.out.println(ans);
    }
}
