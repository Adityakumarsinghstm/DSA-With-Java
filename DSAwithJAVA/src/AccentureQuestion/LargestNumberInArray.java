package AccentureQuestion;

public class LargestNumberInArray {
    public static int findLargest(int[] arr)
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1,4,6,7,8,9};
        int res = findLargest(arr);
        System.out.println(res);
    }
}
