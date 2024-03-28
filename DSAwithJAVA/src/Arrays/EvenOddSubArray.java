package Arrays;

public class EvenOddSubArray {
    //Naive solution
/*
    static int findMaxLength(int[] arr)
    {
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]%2==0 && arr[j-1]%2!=0 || arr[j]%2!=0 && arr[j-1]%2==0)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            res = Math.max(res,count);
        }
        return res;
    }
*/



//Efficient solution
    static int findMaxLength(int[] arr)
    {
        int n = arr.length;
        int curr = 1;
        int res = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i]%2==0&&arr[i-1]%2!=0 || arr[i]%2!=0&&arr[i-1]%2==0)
            {
                curr++;
                res=Math.max(curr,res);
            }
            else {
                curr = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {7,10,13,14};
        int ans = findMaxLength(arr);
        System.out.println(ans);
    }
}
