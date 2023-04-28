package Searching;

import java.util.Scanner;

public class LowerBound {
    public static int lowerIndex(int[] arr, int target)
    {
         int n = arr.length;
         int lowIdx = 0;
         int highIdx = n-1;
         int result = -1;
        while (lowIdx<=highIdx){
            int midIdx = lowIdx+(highIdx-lowIdx)/2;
            if(arr[midIdx] == target)
            {
                 result = midIdx;
                highIdx = midIdx-1;
            }
            else if(arr[midIdx]<target)
            {
                lowIdx = midIdx+1;
            }
            else
            {
                highIdx = midIdx-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of element ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of "+n+" size array");
        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the target element ");
        int target = scan.nextInt();
        int result = lowerIndex(arr,target);
        if(result == -1)
        {
            System.out.println("Element is not present in array ");
        }
        else
        {
            System.out.println("The first occurence of an element in array is "+result);
        }
    }
}
