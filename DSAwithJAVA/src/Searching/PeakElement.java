package Searching;

public class PeakElement {
/*    static int findPeak(int[] arr)
    {
        int n = arr.length;
        if(n==1)
        {
            return arr[0];
        }
       if(arr[0]>=arr[1])
       {
           return arr[0];
       }

        if (arr[n - 1] >= arr[n - 2])
        {
            return arr[n - 1];
        }

        for (int i = 1; i < n; i++) {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
                return arr[i];
        }
         return -1;

    }*/
    //Efficient Solution
    static int findPeak(int[] arr)
    {
        int n = arr.length;
        int low =0, high = n-1;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if(mid>0 && mid<n-1)
            {
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
                {
                    return arr[mid];
                }
                else if(arr[mid]<arr[mid-1])
                {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else if(mid == 0)
            {
               if(arr[0]>arr[1])
               {
                   return arr[0];
               }
               else
               {
                   return arr[1];
               }
            }
            else if(mid == n-1)
            {
                if(arr[n-1]>arr[n-2])
                {
                    return arr[n-1];
                }
                else
                {
                    return arr[n - 2];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1};
        int ans = findPeak(arr);
        System.out.println(ans);
    }
}
