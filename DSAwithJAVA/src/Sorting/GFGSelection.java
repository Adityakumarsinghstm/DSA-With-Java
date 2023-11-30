package Sorting;

public class GFGSelection {
    public static void selection(int[] arr) {
     int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[min_idx])
                {
                    min_idx = j;
                }
            }
            if(min_idx != i)
            {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,65,4,90,45};
        selection(arr);
    }
}
