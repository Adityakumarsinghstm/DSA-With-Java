package Searching;
public class MajorityElement {
   /* static int findMajority(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>n/2)
            {
                return i;
            }
        }
        return -1;
    }*/

    //Efficient solution (using Moore's voting algorith)

    static int findMajority(int[] arr)
    {
        int n = arr.length;
        int res = 0 , count =1;
        for (int i = 1; i < n; i++) {
            if(arr[res]==arr[i])
            {
                count++;
            }
            else
            {
                count --;
            }
            if(count == 0)
            {
                res = i;
                count = 1;
            }
        }
       // count =0;
        for (int i = 0; i < n; i++) {
            if(arr[res]==arr[i])
            {
                count ++;
            }
            if(count <= n/2)
            {
                res = -1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,7,4,7,7,5};
        int ans = findMajority(arr);
        System.out.println(ans);
    }
}
