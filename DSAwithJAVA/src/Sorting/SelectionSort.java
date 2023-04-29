//Time complexity = O(n^2)
//Space Complexity = O(1)
package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            //min-indx holds the minimum element of the array
            int min_idx = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[min_idx])
                {
                    min_idx  = j;
                }
            }
            if(min_idx != i)
            {
                //swapping of element
                int temp = arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {90,12,23,89,45,64};
        //calling function
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
