package Arrays;

import java.util.Scanner;

public class PrefixSum
{
    static int[] sumOfPrefix(int [] arr)
    {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the "+n+" element");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        System.out.println("Output array");
        int[] pref = sumOfPrefix(arr);
        printArray(pref);

    }
}
