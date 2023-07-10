package BackTraking;

import java.util.Scanner;

public class TilesQuestion {
    public static int getway(int n)
    {
        if(n<=3)
        {
            return n;
        }
        else
            return getway(n-1)+getway(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scan.nextByte();
        int result = getway(num);
        System.out.println(result);
    }
}
