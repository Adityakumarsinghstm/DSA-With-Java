package Sorting;

public class GFGBubbleSort {
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            boolean swapped  = false;
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 12, 43, 23, 90, 78, 34};
        sort(arr);
    }
}
