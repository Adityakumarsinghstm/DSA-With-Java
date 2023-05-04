package Recursion;

import java.util.Scanner;

public class FindPower
{
    public static int powerOfElement(int a, int b)
    {
        int result =0;
        if(b==1)
        {
            return a;
        }
        else
        {
            result = a* powerOfElement(a,b-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element and the power element");
        int num = scan.nextInt();
        int pnum = scan.nextInt();
        int result = powerOfElement(num, pnum);
        System.out.println("Answer is :" + result);
    }
}
