//Time complexity = O(n^2)
//Space complexity = O(1)
package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j>0 && arr[j]<arr[j-1])
            {
                //swapping the element
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {20,12,45,67,34,90,78,14};
        //calling function
        insertionSort(arr);
        System.out.println("The sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
