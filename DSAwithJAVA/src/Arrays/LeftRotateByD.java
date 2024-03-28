package Arrays;

public class LeftRotateByD {

    //Method 1
    /*static void leftRotate(int[] arr)
    {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

    }
    static int[] rotateByD(int[] arr,int d)
    {
        for (int i = 0; i <d ; i++) {
            leftRotate(arr);
        }
        return arr;
    }*/

    //Method 2
    /*static int[] rotateByD(int[] arr, int d)
    {
        int n = arr.length;
        int[] temp = new int[d];
        for (int i = 0; i <d ; i++) {
            temp[i]=arr[i];
        }
        for (int i = d; i <n ; i++) {
            arr[i-d]=arr[i];
        }
        for (int i =0; i < d; i++) {
            arr[n-d+i]=temp[i];
        }
        return arr;
    }*/

    //Method 3
    static void reverse(int[] arr,int low , int high)
    {
        while (low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] =temp;
            low++;
            high--;
        }
    }

    static int[] rotateByD(int[] arr,int d)
    {
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int d= 3;
        int[] ans = rotateByD(arr,d);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
