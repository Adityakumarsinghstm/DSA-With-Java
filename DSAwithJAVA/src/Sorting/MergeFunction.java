package Sorting;

public class MergeFunction {
    public static void sort(int low,int mid ,int high, int[]  arr)
    {
        int[] left = new int[mid+1];
        for (int i = 0; i <= mid; i++) {
            left[i]=arr[i];
        }
        int[] right = new int[high-mid];
        for (int i = 0; i <= high-mid; i++) {
            right[mid+1+i] = arr[mid+1+i];
        }
    }
    public static void main(String[] args) {
        int low = 0;
        int mid =2;
        int high = 4;
        int[] arr = {10,15,20,11,30};
        sort(low,mid,high,arr);

    }
}
