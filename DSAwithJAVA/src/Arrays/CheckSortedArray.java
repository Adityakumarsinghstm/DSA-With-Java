package Arrays;

public class CheckSortedArray {
    static boolean checkSorted(int[] arr)
    {
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {100};
        boolean ans = checkSorted(arr);
        System.out.println(ans);

    }
}
