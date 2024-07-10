package ShashCodeBinarySearch;

public class SortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,11,23};
//        int index = minElement(arr);
//        System.out.println(arr[index]);
//
//        rotationCountInACWSA(arr);
//        rotationCountInCWSA(arr);
//
//        int indexMax = maxElement(arr);
//        System.out.println(arr[indexMax]);
        int ans = searchInRotatedSortedArray(arr,6);
        System.out.println(ans);

    }
    static int searchInRotatedSortedArray(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[start]<=arr[mid])
            {
                if(target>=arr[start] && target<arr[mid])
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(target>arr[mid] && target<=arr[end])
                {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }

        }
        return ans;
    }
    static void rotationCountInACWSA(int[] arr)
    {
        int index = minElement(arr);
        System.out.println("Rotation Count in ANCWSA : "+((arr.length-index)%arr.length));
    }
    static void rotationCountInCWSA(int[] arr)
    {
        int index = minElement(arr);
        System.out.println("Rotation Count in CWSA : "+index);
    }
    static int minElement(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            int mid = start+(end-start)/2;
            if(mid>0 && arr[mid]<arr[mid-1])
            {
                return mid;
            }
            else if(arr[end]>arr[mid])
            {
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return start;
    }

    static int minElementDuplicates(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[start]==arr[mid] && arr[mid]==arr[end])
            {
                start++;
                end--;
            }
            else if(mid>0 && arr[mid]<arr[mid-1])
            {
                return mid;
            }
            else if(arr[end]>=arr[mid])
            {
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return start;
    }

    static int maxElement(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            int mid = start+(end-start)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[start]>arr[mid])
            {
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return end;
    }

}
