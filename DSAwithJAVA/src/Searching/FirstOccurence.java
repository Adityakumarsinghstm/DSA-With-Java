package Searching;

public class FirstOccurence {
    static int findFirstOccurence(int[] arr,int ele)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high)
        {
            int mid = low+(high-low)/2;

            if(arr[mid] ==ele)
            {
                if(mid == 0 || arr[mid-1] != arr[mid])
                {
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if(arr[mid]>ele)
            {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,10,10,10,20,20,30};
        int ans = findFirstOccurence(arr,20);
        System.out.println(ans);
    }
}
