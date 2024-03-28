package Searching;

public class GFGBinarySearch1 {
    static int findElement(int[] arr, int ele)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]==ele)
            {
                return mid;
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
        int[] arr = {10,20,30,40,50,60};
        int ans = findElement(arr,40);
        System.out.println(ans);
    }
}
