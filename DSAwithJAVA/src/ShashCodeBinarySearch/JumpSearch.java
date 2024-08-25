package ShashCodeBinarySearch;

public class JumpSearch {
    public static int jumpSearchAlgo(int[] arr,int target)
    {
        int n = arr.length;
        int blockSize = (int)Math.sqrt(n);
        int startIndex = 0;
        int endIndex = blockSize;

        while (endIndex < n && arr[endIndex] <= target)
        {
            startIndex = endIndex;
            endIndex += blockSize;
            if(endIndex > n){
                endIndex = n;
            }
        }
        int res = -1;
        for(int i = startIndex; i<endIndex;i++)
        {
            if(arr[i]==target)
            {
                res = i;
            }
        }
        return res;
    }

    //Ternary Search Code
    public static int ternarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int index = -1;
        while (start<=end)
        {
            int mid1 = start +(end - start)/3;
            int mid2 = end -(end-start)/3;

            if(target<=arr[mid1])
            {
                if(target == arr[mid1])
                {
                    index = mid1;
                    break;
                }
                else {
                    end = mid1 -1;
                }
            }
            else if(target>=arr[mid2])
            {
                if(target == arr[mid2])
                {
                    index = mid2;
                    break;
                }
                else {
                    start = mid2 +1;
                }
            }
            else{
                start = mid1+1;
                end = mid2 -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,34,45,65,77};
        //int index = jumpSearchAlgo(arr,2);
        int index = ternarySearch(arr,10);
        if(index == -1)
        {
            System.out.println("Element Not Found ");
        }
        else{
            System.out.println("Element Found at :"+index);
        }
    }
}
