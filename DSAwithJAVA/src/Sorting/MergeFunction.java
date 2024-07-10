package Sorting;

public class MergeFunction {
    public static void sort(int low,int mid ,int high, int[]  arr)
    {
        int n1 = mid -low +1;
        int n2 = high -mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[n1 +i];
        }

        int i = 0;
        int j = 0;
        while (i < n1 && j < n2)
        {
            if(left[i]<right[j])
            {
                System.out.print(left[i]+" ");
                i++;
            }
            else {
                System.out.print(right[j]+" ");
                j++;
            }
        }
        while (i<n1)
        {
            System.out.print(left[i]);
            i++;
        }
        while (j<n2)
        {
            System.out.print(right[j]);
            j++;
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
