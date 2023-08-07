package Arrays;

public class MaxValueOfPair {
    //My Approach
    /*static  int maxDiff(int[] arr)
    {
        int n = arr.length;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[j]-arr[i]>maxValue)
                {
                    maxValue = arr[j]-arr[i];
                }
            }
        }
        return maxValue;
    }*/

    //Sandeep sir's approach
    /*static  int maxDiff(int[] arr)
    {
        int n = arr.length;
        int res = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <n ; i++) {
            if(arr[i]-arr[res]>maxValue)
            {
                maxValue = arr[i]- arr[res];
                res++;
            }
        }
        return maxValue;
    }
*/

    //Efficient Approach
    static int maxDiff(int[] arr) {
        int n = arr.length;
        int res = arr[1]-arr[0];
        int minVal = arr[0];
        for (int i = 1; i <n ; i++) {
            res = max(res,arr[i]-minVal);
            minVal = min(minVal,arr[i]);
        }
        return res;
    }
    static int max(int res, int ele)
    {
        int max = 0;
        if(res>ele)
        {
            max = res;
        }
        else
        {
            max = ele;
        }
        return max;
    }
    static int min(int minVal, int ele)
    {
        int min = 0;
        if(minVal<ele)
        {
            min = minVal;
        }
        else
        {
            min = ele;
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr= {7,9,5,6,3,2};
        int ans = maxDiff(arr);
        System.out.println(ans);
    }
}
