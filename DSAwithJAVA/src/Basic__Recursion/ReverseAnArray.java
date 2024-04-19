package Basic__Recursion;

public class ReverseAnArray {

    static int[] reverseArray(int n, int []nums) {
        // Write your code here.

        int i = 0;
        int size = n;
        int[]  arr = new int[size];
        while (i<size)
        {
            arr[i]=nums[n-1];
            i++;
            n--;
        }
        //reverseArray(n-1,nums);
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {12,5,8,3,23,9,11};
        int [] ans =  reverseArray(7,arr);
        for (int n:ans
             ) {
            System.out.println(n);
        }
    }
}
