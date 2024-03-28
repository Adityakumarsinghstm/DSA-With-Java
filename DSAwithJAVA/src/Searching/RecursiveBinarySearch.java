package Searching;

public class RecursiveBinarySearch {
    static int bSearch(int[] arr, int low, int high, int ele)
    {
        if(low>high)
            return -1;
        int mid = low+(high-low)/2;
        if(arr[mid]==ele)
            return mid;
        else if(arr[mid]>ele)
           return bSearch(arr,low,mid-1,ele);
        else
            return   bSearch(arr,mid+1,high,ele);


    }
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};

        int ans = bSearch(arr,0,arr.length-1,80);
        System.out.println(ans);
    }
}
