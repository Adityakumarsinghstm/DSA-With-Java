package ShashCodeBinarySearch;

public class MinimizedMaxiumOfProduct {
    public  static  int minimizedMaximum(int n, int[] quantities) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < quantities.length; i++) {
            if(quantities[i]>end){
                end = quantities[i];
            }
        }

        int res = -1;
        while (start <= end)
        {
            int mid = start +(end - start)/2;
            if(isDistributionPossible(quantities,mid,n))
            {
                res = mid;
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return  res;
    }
    public static boolean isDistributionPossible(int[]quantities,int maxProduct,int stores)
    {
        int storeCount = 0;
        for (int i = 0; i < quantities.length; i++) {
            storeCount += quantities[i]/maxProduct;
            if(quantities[i]%maxProduct!=0)
            {
                storeCount += 1;
            }
            if(storeCount > stores)
            {
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] quantities = {100000};
        int store = 1;
        int ans = minimizedMaximum(store,quantities);
        System.out.println(ans);
    }
}
