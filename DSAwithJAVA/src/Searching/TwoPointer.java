package Searching;

public class TwoPointer {
    static boolean isPair(int[] arr,int x)
    {
        int n = arr.length;
        int left =0;
        int right = n-1;
        while(left<right)
        {
            if(arr[left]+arr[right]==x)
            {
                return true;
            }
            else if(arr[left]+arr[right]>x)
            {
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {2,4,8,9,11,12,20,30};
        boolean ans = isPair(arr,23);
        System.out.println(ans);
    }
}
