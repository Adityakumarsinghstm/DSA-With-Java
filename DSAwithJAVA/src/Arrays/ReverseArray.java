package Arrays;

public class ReverseArray {
    /*static int[] reverseArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        return arr;
    }*/

    //Sandeep sir's approach
    static int[] reverseArray(int[] arr)
    {
        int low=0;
        int high = arr.length-1;
        while (low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,5,7,30};
        int[] ans = reverseArray(arr);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
