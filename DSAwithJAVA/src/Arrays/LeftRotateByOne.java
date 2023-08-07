package Arrays;

public class LeftRotateByOne {
    static int[] leftRotate(int[] arr)
    {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={30,5,20};
        int[] ans = leftRotate(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
