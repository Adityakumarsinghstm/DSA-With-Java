package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in Array : ");
        int n = sc.nextInt();

        //Input the element in array
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        //Input the target Element
        System.out.println("Enter the target Element : ");
        int target = sc.nextInt();

        //Create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }

        //Create a result array
        int[] result = new int[2];

        //if current is equal to the target
        for (int i = 0; i < n; i++) {
            if(arr[i]==target && map.containsKey(0))
            {
                result[0] = i;
                result[1] = map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i]))
            {
                if(map.get(target-arr[i]) > i)
                {
                    result[0] =i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }

            }

        }
        System.out.println("The sum of index value is : ["+result[0]+","+result[1]+"]");
    }
}
