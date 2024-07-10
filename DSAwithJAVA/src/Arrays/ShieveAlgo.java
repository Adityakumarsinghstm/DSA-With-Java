package Arrays;


import java.util.Arrays;

public class ShieveAlgo {
    public static void sheiveAlgorithm(int num)
    {
        boolean[] arr = new boolean[num+1];
        Arrays.fill(arr,true);
        int counter = 2;
        while (counter<num)
        {
            if(arr[counter]==true)
            {
                for(int refactor = counter + counter; refactor < num +1; refactor+=counter)
                {
                    arr[refactor] = false;
                }
            }
            counter++;
        }
        for (int i = 2; i <num+1 ; i++) {
            System.out.println(i + " : "+arr[i]);
        }
    }
    public static void main(String[] args) {
        sheiveAlgorithm(40);
    }
}
