package Searching;

public class Leetcode34 {

    static int binr(int[] arr, int target,boolean isFirst)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target)
            {
                ans = mid;
                if(isFirst)
                {
                    end = mid -1;

                }
                else{
                    start = mid + 1;
                }
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] res = new int[2];
        int []arr = {4,4,8,8,8,15,16,23,23,42};
        int target = 8;
        int first = binr(arr,target,true);
        int last = binr(arr,target,false);
        res[0] = first;
        res[1] = last;
        //System.out.println("Index of :"+target+" is : "+ans);
        System.out.println("answer is :"+res[0]+":"+res[1]);
        if(first == -1 )
        {
            System.out.println("Total number of occurence  is : "+0);
        }
        else {
            System.out.println("Total number of occurence is : "+(last - first+1));
        }


    }
}
