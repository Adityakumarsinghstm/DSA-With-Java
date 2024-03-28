package Arrays;

public class MaxConsicutiveOnes {
    //Naive Approach
         /* static int findMaxConsicutive(int[] arr)
          {
              int res = 0;
              int n = arr.length;
              for (int i = 0; i <n ; i++) {
                  int curr = 0;
                  for (int j = i; j < n; j++) {
                      if(arr[j]==1)
                          curr++;
                      else
                          break;
                  }
                  res = Math.max(res, curr);
              }
              return res;
          }*/


    //Efficient Solution
    static int findMaxConsicutive(int[] arr)
    {
        int n = arr.length;
        int curr =0, res = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==0)
            {
                curr=0;
            }
            else{
                curr++;
                res= Math.max(curr, res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,0,1,1};
        int ans = findMaxConsicutive(arr);
        System.out.println(ans);
    }
}
