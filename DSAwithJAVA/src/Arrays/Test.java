package Arrays;

public class Test {
    public static  int largest(int arr[], int n)
    {
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {

            if(arr[i]>maxValue)
            {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int [] arr = {34,53,12,4,90};
        int ans = largest(arr,5);
        System.out.println(ans);

    }
}
