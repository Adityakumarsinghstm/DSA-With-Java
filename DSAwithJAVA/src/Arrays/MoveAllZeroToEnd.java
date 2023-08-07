package Arrays;

public class MoveAllZeroToEnd {
    static int[] moveZero(int[] arr)
    {
        int n = arr.length;
        /*for (int i = 0; i < n; i++) {
            if(arr[i]==0)
            {
                for (int j = i+1; j < n; j++) {
                    if(arr[j]!=0)
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }*/

        int res = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]!=0)
            {
                int temp = arr[res];
                arr[res]=arr[i];
                arr[i]=temp;
                res++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr= {8,5,0,10,0,20};
        int[] ans = moveZero(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
