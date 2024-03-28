package Arrays;

public class RemoveDuplicate {


    //Brute force Approach
    /*static int removeDuplicate(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < n; i++) {
            if(temp[res-1]!=arr[i])
            {
                temp[res]=arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
            arr[i]=temp[i];
        }

        return res;
    }*/


    //Efficient Approach
    static int removeDuplicate(int[] arr)
    {
        int res = 1;
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int ans = removeDuplicate(arr);
        System.out.println(ans);
    }
}
