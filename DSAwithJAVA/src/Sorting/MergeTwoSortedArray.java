package Sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void merge(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;

        int[] c= new int[m+n];
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[i+m]=b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < m+n; i++) {
            System.out.print(c[i]+" ");
        }
    }
    public static void mergeTwoSortEfficient(int[] a, int[] b)
    {
        int i = 0;
        int j = 0;
        while (i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while (i<a.length)
        {
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<b.length)
        {
            System.out.print(b[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {10, 15, 20};
        int[] b = {5, 6, 6, 15};
        //merge(a,b);
        mergeTwoSortEfficient(a,b);
    }
}
