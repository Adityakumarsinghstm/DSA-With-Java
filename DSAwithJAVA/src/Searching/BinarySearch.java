//time complexity : O(logN)
//space complexity: O(1)
package Searching;

import java.util.Scanner;

public class BinarySearch {
    static int searchElement(int[] arr, int target)
    {
        int n = arr.length;
        int lowIndx = 0;
        int highIndx = n-1;

        while (lowIndx<=highIndx)
        {
            int midIndx = lowIndx+(highIndx-lowIndx)/2;
            if (arr[midIndx]==target)
            {
                return midIndx;
            }
            else if(arr[midIndx]<target)
            {
                lowIndx = midIndx+1;
            }
            else
            {
                highIndx = midIndx-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element number ");
        int ele = scan.nextInt();

        int[] arr = new int[ele];
        System.out.println("Enter the elements in sorted order");
        for (int i = 0; i < ele; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the target element");
        int target = scan.nextInt();
        int result = searchElement(arr,target);
        if(result == -1)
        {
            System.out.println("Element not found yet! ");
        }
        else {
            System.out.println("Element found at " + result + " index");
        }
    }
}
