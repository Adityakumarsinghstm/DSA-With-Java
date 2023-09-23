package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        /*int[] arr1 = {12, 3, 14, 89, 4, 90};
        char[] arr2 = {'A', 'Z', 'P', 'B'};

        int[] arr3 = {5, 30, 10, 20, 8};
        Arrays.sort(arr3, 1, 4);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr3));*/

        List l1 = new ArrayList();
        l1.add(12);
        l1.add(2);
        l1.add(45);
        l1.add(4);

        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
    }
}
