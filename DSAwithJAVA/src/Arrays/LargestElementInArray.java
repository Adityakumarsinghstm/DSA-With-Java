package Arrays;

public class LargestElementInArray {
    static int findLargest(int[] arr)
    {
        int res =0;
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]>arr[res])
            {
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={10,5,20,8};
        int ans = findLargest(arr);
        System.out.println(ans);
    }
}
