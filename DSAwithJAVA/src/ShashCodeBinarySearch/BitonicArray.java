package ShashCodeBinarySearch;

import java.util.Arrays;

public class BitonicArray {
    public static void main(String[] args) {
        int[] arr = {1,4,12,23,34,45,43,33,22,11,6,5,0};
        //findMinEleInBitonicArray(arr);
//        int ans = findPeackElementInBiotonicArray(arr);
//        if(ans == -1)
//        {
//            System.out.println("Element Not found ");
//        }
//        else {
//            System.out.println("Element "+arr[ans]+" Found at "+ans);
//        }
        findElementInBitonicArray(arr,5);
    }

    static void findElementInBitonicArray(int[] arr,int target)
    {
        int index = findPeackElementInBiotonicArray(arr);
        if(index == -1 || arr[index] < target)
        {
            System.out.println("Element Not Exists ");
        }
        else{
            if(arr[index] == target)
            {
                System.out.println("Element "+arr[index]+"Exist at  :"+index);
                return;
            }
            int ans = binarySearch(arr,0,index-1,target);
            if(ans == -1)
            {
                ans = binarySearchDec(arr,index+1,arr.length-1,target);
            }
            if(ans == -1)
            {
                System.out.println("Element does not Exists");
            }
            else{
                System.out.println("Element "+arr[ans]+" Exist at  :"+ans);
            }
        }



    }

    static int findPeackElementInBiotonicArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            int next = (mid + 1)%arr.length;
            int prev = (mid -1 + arr.length)%arr.length;
            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            }
            else if(arr[mid]>arr[prev])
            {
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
    static void findMinEleInBitonicArray(int[] arr)
    {
        if(arr.length == 0)
        {
            System.out.println("Array is Empty ");
        }
        else if(arr.length == 1)
        {
            System.out.println("Minimum Element : "+arr[0]);
        }
        else{
            int res = (arr[0]<arr[arr.length-1])?arr[0]:arr[arr.length-1];
            System.out.println("Min element : "+ res);
        }
    }

    static int binarySearch(int[] arr,int lowIndx,int highIndx, int target)
    {
        int n = arr.length;
//        int lowIndx = 0;
//        int highIndx = n-1;
        int ans = -1;

        while (lowIndx<=highIndx)
        {
            int midIndx = lowIndx+(highIndx-lowIndx)/2;
            if (arr[midIndx]==target)
            {
                ans = midIndx;
                break;
            }
            else if(arr[midIndx]<target)
            {
                lowIndx = midIndx+1;
            }
            else
            {
                highIndx = midIndx-1;
            }
        }
        return ans;
    }


    static int binarySearchDec(int[] arr,int lowIndx,int highIndx, int target)
    {
        int n = arr.length;
//        int lowIndx = 0;
//        int highIndx = n-1;
        int ans = -1;

        while (lowIndx<=highIndx)
        {
            int midIndx = lowIndx+(highIndx-lowIndx)/2;
            if (arr[midIndx]==target)
            {
                ans = midIndx;
                break;
            }
            else if(arr[midIndx]<target)
            {
                highIndx = midIndx-1;
            }
            else
            {
                lowIndx = midIndx+1;
            }
        }
        return ans;
    }
}
