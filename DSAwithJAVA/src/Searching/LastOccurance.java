package Searching;

public class LastOccurance {
    static int findLastOccur(int[] arr,int ele)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]>ele)
            {
                high = mid-1;
            }
            else if(arr[mid]<ele)
            {
                low = mid+1;
            }
            else {
                if(mid == n-1 || arr[mid] !=arr[mid+1])
                {
                    return mid;
                }
                else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8,10,10,12};
        int ans = findLastOccur(arr,7);
        System.out.println(ans);

    }
}
