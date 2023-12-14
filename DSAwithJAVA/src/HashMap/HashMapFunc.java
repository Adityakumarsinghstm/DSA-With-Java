package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunc {
    public static void main(String[] args) {
        HashMap <Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Aditya");
        hashMap.put(2, "manish");
        hashMap.put(3, "Rohit");
        hashMap.put(4, "Pravin");

        System.out.println("Hashmap of given data is :"+ hashMap);

        String result = hashMap.get(2);
        System.out.println("value for the given key is :"+result);

        System.out.println(hashMap.containsKey(3));

        hashMap.remove(4);
        System.out.println("Updated hashmap :"+ hashMap);

        for(Map.Entry<Integer,String> e: hashMap.entrySet())
        {
            System.out.println("Hashmap is : "+e.getKey() +" : "+ e.getValue());
        }
    }
}
