package Searching;

import java.util.HashSet;

public class LeetCode744 {

    static int binarySearchfloor(int[] arr, int target)
    {
        int ans = -1;
            int start = 0;
            int end = arr.length-1;
            while (start<=end){
                int mid = (start+end)/2;
                if(arr[mid]==target)
                {
                    ans = mid;
                    break;

                }
                else if(target>arr[mid])
                {
                    start = mid+1;
                    ans = arr[mid];
                }
                else{
                    end = mid -1;
                }
            }
            return ans;
        }
    static int binarySearchCeil(int[] arr, int target)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target)
            {
                ans = mid;
                break;

            }
            else if(target>arr[mid])
            {
                start = mid+1;

            }
            else{
                end = mid -1;
                ans = arr[mid];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {4,4,8,8,8,15,16,23,23,42};
        int ans = binarySearchfloor(arr,13);
        System.out.println("Floor value is : "+ans);
        int ans1 = binarySearchCeil(arr,13);
        System.out.println("Ceil value is : "+ans1);

    }
    }
