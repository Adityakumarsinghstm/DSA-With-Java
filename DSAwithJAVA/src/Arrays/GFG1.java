package Arrays;

public class GFG1 {
    static int checkElement(int[] arr, int n, int ele)
    {
        for (int i = 0; i < n; i++) {
            if(arr[i]==ele)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {20,5,7,25};
        int n = arr.length;
        int ans  = checkElement(arr,n,25);
        System.out.println(ans);
    }
}
