package Arrays;

import java.util.Scanner;

public class GFGInsertInFixedArray {
    static int insertElement(int[] arr, int n, int x, int pos, int cap)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        if(n==cap)
        {
            return n;
        }
        int index = pos-1;
        for (int i = n-1; i >=index; i--) {
             arr[i+1]=arr[i];
        }
        arr[index] = x;
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        return n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[8];
       System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the insert element ");
        int x = sc.nextInt();
        System.out.println("Enter the position ");
        int pos = sc.nextInt();

        int cap = arr.length;
        int ans = insertElement(arr,n,x,pos,cap);
        System.out.println(ans);



    }
}
