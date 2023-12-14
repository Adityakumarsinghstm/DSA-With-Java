package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TypesOfHashMap {
    public static void main(String[] args) {
        //Unordered data will be return
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(4, "raghu");
        map1.put(3, "sumit");
        map1.put(7, "prashant");
        map1.put(1, "aditya");

        System.out.println("HashMap class map looks like this : " + map1);

        //Order of Insertion is retained in LinkedHashMap
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(4, "raghu");
        map2.put(3, "sumit");
        map2.put(7, "prashant");
        map2.put(1, "aditya");

        System.out.println("LinkedHashMap class map looks like this : " + map2);


    }
}
