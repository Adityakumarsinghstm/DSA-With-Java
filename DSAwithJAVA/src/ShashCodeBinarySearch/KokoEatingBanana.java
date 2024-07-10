package ShashCodeBinarySearch;

public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = 0; i < piles.length; i++) {
            if(piles[i]>end)
            {
                end = piles[i];
            }
        }
        while(start<=end)
        {
            int mid = start+ (end - start)/2;
            if(isEatingSpeedValid(piles,mid, h))
            {
                ans = mid;
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }

    static boolean isEatingSpeedValid(int[] piles,int eatingSpeed, int hour)
    {
        int hourSpent = 0;
        for (int i = 0; i < piles.length; i++) {
            hourSpent += piles[i]/eatingSpeed;
            if(piles[i]%eatingSpeed != 0)
            {
                hourSpent += 1;
            }
            if(hourSpent > hour) return false;
        }

        return true;
    }
}
