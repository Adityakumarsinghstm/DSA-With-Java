package Arrays;

public class TraipingRainWater {
    static int findMax(int[] arr)
    {
        int n = arr.length;
        int[] lefMax = new int[n];
        int[] rightMax = new int[n];
        lefMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lefMax[i]=Math.max(lefMax[i-1],arr[i]);
        }
        rightMax[n-1] = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
           rightMax[i]= Math.max(rightMax[i+1],arr[i]);
        }
        int ans = 0;
        for (int i = 0; i <n ; i++) {
            ans += Math.min(lefMax[i],rightMax[i])-arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans = findMax(arr);
        System.out.println(ans);
    }
}
