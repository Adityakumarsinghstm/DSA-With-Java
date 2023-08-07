package Arrays;

public class FrequenciesInSortedArray {
    static void frequency(int[] arr)
    {
        int n = arr.length;
        int freq = 1;
        int i = 1;
        while (i<n)
        {
            while (i<n && arr[i-1]==arr[i])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[i-2]!=arr[i-1])
        {
            System.out.println(arr[i-1]+" "+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,10,10,25,30,30};
        frequency(arr);
    }
}
