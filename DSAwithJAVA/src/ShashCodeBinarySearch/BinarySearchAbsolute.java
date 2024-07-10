package ShashCodeBinarySearch;

public class BinarySearchAbsolute {
    public static void main(String[] args) {
        int[] arr = {2,2,4,5,7,9,25,56,84,88};
        //int ans = findMinimumAbsoluteDifference(arr,0);
        //System.out.println("Minimum absolute difference is : "+ans);

        findElementInInfiniteSortedArray(arr,25);


    }
    static void findElementInInfiniteSortedArray(int[] arr, int target)
    {
        int[] range = findRangeInInfinite(arr,target);
        System.out.println(range[0]+" , "+range[1]);

        int ans = binarySearchInRange(arr,target,range[0],range[1]);
        if(ans == -1)
        {
            System.out.println("Element doesn't exists ");
        }
        else{
            System.out.println("Element Exist at : "+ans);
        }
    }
    static int findMinimumAbsoluteDifference(int[] arr, int target)
    {
        int n = arr.length;
        int lowIndx = 0;
        int highIndx = n-1;
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
        int res = 0;
        if(ans == -1)
        {
            if(highIndx == -1)
            {
                res = Math.abs(target - arr[lowIndx]);
            }
            else if(lowIndx == arr.length)
            {
                res = Math.abs(target - arr[highIndx]);
            }
            else {
                int ans1 = Math.abs(target - arr[lowIndx]);
                int ans2 = Math.abs(target - arr[highIndx]);
                res = (ans1<ans2)?ans1:ans2;
            }
        }

        return res;
    }

    static int[] findRangeInInfinite(int[] arr,int target)
    {
        int[] range = new int[2];
        int start = 0;
        int end = 1;
        while(arr[end]<target)
        {
            start = end;
            end = 2*end;
        }
        range[0] = start;
        range[1] = end;

        return range;
    }

    static int binarySearchInRange(int[] arr,int ele,int low, int high)
    {
       // int n = arr.length;

        while (low<=high)
        {
            int mid = low+(high-low)/2;

            if(arr[mid] ==ele)
            {
                if(mid == 0 || arr[mid-1] != arr[mid])
                {
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if(arr[mid]>ele)
            {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    static int findFirstOccurence(int[] arr,int ele)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high)
        {
            int mid = low+(high-low)/2;

            if(arr[mid] ==ele)
            {
                if(mid == 0 || arr[mid-1] != arr[mid])
                {
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if(arr[mid]>ele)
            {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
}
