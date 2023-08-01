package Arrays;

public class SecondLargestElement {
    static int findLargest(int[] arr)
    {
        int largest = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>arr[largest])
            {
                largest = i;
            }
        }
        return largest;
    }

    static int findSecondLarges(int[] arr)
    {
        int largest = findLargest(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[largest])
            {
                if(res == -1)
                {
                    res = i;
                }
                else if(arr[i]>arr[res])
                {
                    res = i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {20,10,20,8,12};
        int ans = findSecondLarges(arr);
        System.out.println(ans);
    }
}
