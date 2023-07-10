package Mathematics;

import java.util.Scanner;

public class Palindrome {
  public static boolean findPalidrome(int x)
  {
      int temp = x;
      int rev = 0;
      while (temp!=0)
      {
          int lastDigit = temp%10;
          rev = rev*10+lastDigit;
          temp= temp/10;
      }
      if(rev==x)
      {
          return  true;
      }
      return false;
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for testing the palidrome: ");
        int num = sc.nextInt();
        boolean ans = findPalidrome(num);
        System.out.println(ans);
    }
}
