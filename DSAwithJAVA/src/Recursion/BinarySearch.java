package Recursion;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int low, int high)
    {
       while (low<=high)
       {
           int mid = low+(high-low)/2;
           if(target == arr[mid])
           {
               return mid;
           }
           else if(target < arr[mid])
           {
               high= mid-1;
               binarySearch(arr,target,low,high);
           }
           else
           {
               low = mid+1;
               binarySearch(arr,target,low,high);
           }

       }
        return -1;

    }
    public static void main(String[] args) {
       int[] arr = {11,23,34,42,56,61,75,85};
       int target = 61 ;
       int ans = binarySearch(arr,target,0,arr.length-1);
       if(ans < 0)
       {
           System.out.println("Element not found ");
       }
       else
       {
           System.out.println("The index of "+target +" is "+ans);
       }


    }
}
