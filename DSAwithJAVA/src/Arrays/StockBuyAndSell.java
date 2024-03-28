package Arrays;

public class StockBuyAndSell {
   static  int maxProfit(int[] arr)
   {
       int n = arr.length;
       int profit = 0;
       for (int i = 1; i < n; i++) {
           if(arr[i]>arr[i-1])
           {
               profit += arr[i]-arr[i-1];
           }
       }
       return profit;
   }
    public static void main(String[] args) {
        int[] arr= {1,5,3,1,2,8};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
