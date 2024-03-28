package Searching;

import java.util.Arrays;

public class RepeatingElement {
    //Super Naive solution
   /* static int findRepeating(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return 0;
    }*/


    //Naive solution
    static int findRepeating(int[] arr)
    {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i]==arr[i+1])
            {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,3,4,5};
        int ans = findRepeating(arr);
        System.out.println(ans);
    }
}
