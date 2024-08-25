package Arrays;

public class MaxSubArray {
    //Naive Approach
//    static int findMaxSubArray(int[] arr)
//    {
//       int res = arr[0] ;
//        for (int i = 0; i < arr.length; i++) {
//            int curr = 0;
//            for (int j = i; j < arr.length; j++) {
//                curr = curr+arr[j];
//                res = Math.max(curr,res);
//            }
//        }
//        return res;
//    }

    //Efficient Approach
    static int findMaxSubArray(int[] arr)
    {
        int n = arr.length;
        int maxEnd = arr[0];
        int res = arr[0];
        for (int i = 1; i <n ; i++) {
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            res = Math.max(maxEnd,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = findMaxSubArray(arr);
        System.out.println(ans);
    }
}
