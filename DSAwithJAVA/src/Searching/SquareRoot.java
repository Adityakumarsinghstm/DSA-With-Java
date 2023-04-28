package Searching;

import java.util.Scanner;

public class SquareRoot {
    public static int findSquareRoot(int num)
    {
        int low = 0, high = num, result = -1;
        while(low<=high)
        {
            int mid = (high+low)/2;
            int val = mid*mid;
            if(val==num)
            {
                return mid;
            }
            else if(val<=num)
            {
                result = mid;
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of which you want to square root : ");
        int num = scan.nextInt();

        int result = findSquareRoot(num);
        System.out.println("The number is : "+result);
    }
}
