package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();

        HashMap<Character,Integer> map = new HashMap<>();
        //Creating hashtable
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }

        int result = -1;
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i))==1)
            {
                System.out.println("first non-repeating element is : "+i);
                result = 1;
                break;
            }
        }
        if(result == -1)
        {
            System.out.println("No non-repeating element found ");
        }
    }
}
