//Time complexity = O(n)
//Space complexity = O(1)
package Searching;

import java.util.Scanner;

public class LinearSearch{
    static void searchTarget(int[] arr, int target)
    {
        int n = arr.length;
        int indx = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target)
            {
                indx = i;
                break;
            }

        }
        if(indx==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index :"+indx);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of element ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter the target Element");
        int target = scan.nextInt();

         searchTarget(arr, target);

    }
}
