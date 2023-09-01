package Searching;

public class SearchInSortedRotatedArray {
    //Naive Solution
     /*static int search(int[] arr, int x)
     {
         int n = arr.length;
         for (int i = 0; i < n; i++) {
             if(arr[i]==x)
             {
                 return i;
             }
         }
         return  -1;
     }*/


    static int search(int[] arr, int x)
    {
       int n = arr.length;
       int low = 0;
       int high = n-1;
       while (low<=high)
       {
           int mid = low + (high-low)/2;
           if(arr[mid]==x)
           {
               return mid;
           }
           //Left Half Sorted
           if(arr[low]<arr[mid])
           {
               if(x>=arr[low] && x<arr[mid])
               {
                   high = mid-1;
               }
               else
               {
                   low = mid+1;
               }
           }
           //Right Half Sorted
           else
           {
               if (x > arr[mid] && x <= arr[high]) {
                   low = mid + 1;
               } else {
                   high = mid -1;
               }
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] arr = {100,200,300,10,20};
        int ans = search(arr, 20);
        System.out.println(ans);
    }
}
