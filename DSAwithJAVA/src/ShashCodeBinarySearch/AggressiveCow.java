package ShashCodeBinarySearch;

import java.util.Arrays;

public class AggressiveCow {
    public static int solve(int n, int cows, int[] stalls) {
        if(stalls.length < cows)
        {
            return -1;
        }

        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[n-1]-stalls[0];
        int ans = -1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(isAllocationPossible( mid,  cows, stalls))
            {
                ans = mid;
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }

    static boolean isAllocationPossible( int minDistance, int cows, int[] stalls){
        int cowsCount = 1;
        int lastCowsAllocated = stalls[0];
        for (int i = 1; i <stalls.length ; i++) {
            if(stalls[i]-lastCowsAllocated >= minDistance)
            {
                cowsCount += 1;
                lastCowsAllocated = stalls[i];
            }
            if(cowsCount >= cows)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n =5;
        int cow =3;
        int[] stalls = {1,2,4,8,9};
        int ans = solve(n,cow,stalls);
        System.out.println(ans);
    }
}
