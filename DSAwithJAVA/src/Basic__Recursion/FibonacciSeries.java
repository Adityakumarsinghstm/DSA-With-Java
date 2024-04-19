package Basic__Recursion;

public class FibonacciSeries {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           if(i==0)
           {
               arr[i]=0;
           }
           else if(i==1)
           {
               arr[i]=1;
           }
           else{
               arr[i]=arr[i-1]+arr[i-2];
           }
        }
        return arr;

    }

    public static void main(String[] args) {
         int[] ans = generateFibonacciNumbers(5);
         for (int n : ans )
         {
             System.out.println(n);
         }
    }
}
