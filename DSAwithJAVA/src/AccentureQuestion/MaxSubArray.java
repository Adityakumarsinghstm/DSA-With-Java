package AccentureQuestion;

public class MaxSubArray {
    public static int finMaxSubArray(int[] arr)
    {
        int res = arr[0];
        int maxEnd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            res = Math.max(maxEnd,res);

        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = finMaxSubArray(nums);
        System.out.println(ans);
    }
}
