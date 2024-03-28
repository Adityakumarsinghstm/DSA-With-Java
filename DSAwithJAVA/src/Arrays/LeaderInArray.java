package Arrays;

public class LeaderInArray {
    //Native Approach
   /* static void findLeader(int[] arr)
    {
       int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i+1; j < n; j++) {
                if(arr[i]<=arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }*/


    //Efficient Approach

   static  void findLeader(int[] arr)
   {
       int n = arr.length;
       int curr_leader = arr[n-1];
       System.out.print(curr_leader+" ");
       for (int i = n-2; i>=0 ; i--) {
           if(arr[i]>curr_leader)
           {
               curr_leader= arr[i];
               System.out.print(curr_leader+" ");
           }
       }
   }
    public static void main(String[] args) {
        int[] arr= {7,10,4,10,6,5,2};
        findLeader(arr);

    }
}
