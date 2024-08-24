package String;

import java.util.HashMap;
import java.util.Map;

public class PrintAllSubString {
    public static void main(String[] args) {
        printSubString("Aditya");
    }
    public static void printSubString(String input)
    {
        int n = input.length();
        for (int startIndex = 0; startIndex < n; startIndex++) {
            for (int endIndex = startIndex+1; endIndex <= n; endIndex++) {
                System.out.println(input.substring(startIndex,endIndex));
            }
        }


    }
}
