package BackTraking;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintSequence {
    public static void printSubsequence(int[] arr, int index, ArrayList<Integer> tempArr)
    {
        //Base case
        if(index == arr.length)
        {
            if(tempArr.size()>0)
            {
                System.out.println(tempArr);
            }
            return;
        }
        //Recursion
        //Include
        printSubsequence(arr,index+1,tempArr);
        tempArr.add(arr[index]);

        //Donot include
        printSubsequence(arr,index+1,tempArr);
        tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2};
        System.out.println("For the array - "+ Arrays.toString(arr1));
printSubsequence(arr1,0,new ArrayList<>());
        System.out.println("--------------------------------");
int [] arr2 = {1,2,3};
        System.out.println("For the array - "+ Arrays.toString(arr2));
printSubsequence(arr2,0,new ArrayList<>());

        System.out.println("--------------------------------------");
        int [] arr3 = {1,2,3,4};
        System.out.println("For array - "+Arrays.toString(arr3));
        printSubsequence(arr3,0,new ArrayList<>());

    }
}
