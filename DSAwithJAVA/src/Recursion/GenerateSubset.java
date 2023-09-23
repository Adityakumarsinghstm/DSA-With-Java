package Recursion;

public class GenerateSubset {
    static void subset(String s, String curr,int i)
    {
        if (i == s.length()) {
            System.out.println(s);
            return;
        }
        subset(s, curr, i + 1);
        subset(s,curr+s.charAt(i),i+1);
    }
    public static void main(String[] args) {
        String str = "AB";
        subset(str," ",0);
    }
}
