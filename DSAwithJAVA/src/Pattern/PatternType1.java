package Pattern;

public class PatternType1 {
    public void pattern1(int n)
    {
        for (int i =0;i<n;i++)
        {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n)
    {
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern7(int n)
    {
        for (int i = 0; i < n; i++) {
            //print space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 0; j <i*2+1 ; j++) {
                System.out.print("*");
            }
            //print space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void pattern8(int n)
    {
        for (int i = 0; i < n; i++) {
            //print space
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 0; j < 2*n -(2*i+1); j++) {
                System.out.print("*");
            }
            //print space
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PatternType1 type1 = new PatternType1();
        //type1.pattern1(4);
        //pattern2(4);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(3);
        //pattern7(5);
        pattern8(3);
    }
}
