package Sorting;

import org.codehaus.groovy.runtime.typehandling.IntegerMath;

public class SelectionSort2 {
    public static void sort(int[] arr) {
       int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[min_idx]) {
                    min_idx = j;
                }
            }
            if(min_idx != i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }




    public static void main(String[] args) {
        int[] arr = {24, 10, 50, 30, 70, 90};
        sort(arr);
    }
}
