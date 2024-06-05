package Array2D;

public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr= {
            {2,4,5,6},
            {7,9,1,12},
            {1,8,9,4},
            {9,6,1,10}
        };
        //findTarget(arr,10,false);
        findMaxSumSubArray(arr);
    }
    public static void findTarget(int[][] arr,int target,boolean findLast)
    {
//        int ans = -1;
        int outerIndex = -1;
        int innerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j])
                {
                    outerIndex = i;
                    innerIndex = j;
                    if(findLast == false)
                    {
                        break;
                    }
                }

            }
        }
        System.out.println("Target found at pos :"+outerIndex+" , "+innerIndex);
    }

    public static void findMaxSumSubArray(int [][]arr)
    {
        int resIndex = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                if(max < sum)
                {
                    max = sum;
                    resIndex = i;
                }
            }
        }
        System.out.println("max sum is :" +max +" at index : "+resIndex);
    }
}
