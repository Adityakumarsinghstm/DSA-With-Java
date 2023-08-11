package Searching;
//Time complexity -> O(log n) + O(log n) => O(log n)
public class CountOccurrence {
    static int firstOccur(int[] arr, int ele)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high)
        {
            int mid = low+(high-low)/2;
            if(ele<arr[mid])
            {
                high = mid -1;
            }
            else if(ele>arr[mid])
            {
                low = mid+1;
            }
            else
            {
                if(mid == 0 || arr[mid]!=arr[mid-1])
                {
                    return mid;
                }
                else
                {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    static int lastOccur(int[] arr, int ele)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (ele < arr[mid]) {
                high = mid - 1;
            } else if (ele > arr[mid]) {
                low = mid + 1;
            } else {
                  if(mid == n-1 || arr[mid]!=arr[mid+1])
                  {
                      return mid;
                  }
                  else{
                      low = mid+1;
                  }
            }
        }
        return -1;
    }
    static int totalOccurrence(int[] arr, int ele) {
        int first = firstOccur(arr,ele);
        if(first == -1)
        {
            return 0;
        }
        else
        {
            return lastOccur(arr,ele)-first+1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,10};
        int ans = totalOccurrence(arr,10);
        System.out.println(ans);
    }
}
