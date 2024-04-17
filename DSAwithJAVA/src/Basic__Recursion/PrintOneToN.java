package Basic__Recursion;

public class PrintOneToN {
    public static int[] printNos(int x)
    {
        int[] result = new int[x];
        printNumbers(result,x,0);
        return result;
    }
    public  static  void printNumbers(int[] arr, int n, int i){
        if(i<n)
        {
            arr[i] = i+1;
        }
        printNumbers(arr,n,i+1);
    }

    public static void main(String[] args) {
        int n = 5;
       int[] ans =  new int[n];
       ans = printNos(n);
        for (int e:ans) {
            System.out.println(e);
        }
    }
}
