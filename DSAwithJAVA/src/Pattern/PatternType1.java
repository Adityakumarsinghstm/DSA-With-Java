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

public static void pattern9(int n)
{
    for (int i = 1; i <= (2*n)-1; i++) {
        int star = i;
        if(i>n)
        {
            star = 2*n-i;
        }
        for (int j = 1; j <= star; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void pattern10(int n)
{
    for (int i = 0; i < n; i++) {
        int start = 1;
        if(i%2==0) start =1;
        else start = 0;
        for (int j = 0; j <= i ; j++) {
            System.out.print(start);
            start = 1-start;
        }
        System.out.println();
    }
}
public static void pattern11(int n)
{
    int space = 2*(n-1);
    for (int i = 1; i <=n; i++) {
        //number
        for (int j = 1; j <=i; j++) {
            System.out.print(j);
        }
        //space
        for (int j = 1; j <=space; j++) {
            System.out.print(" ");
        }
        //number
        for (int j = i; j >=1; j--) {
            System.out.print(j);
        }
        System.out.println();
        space -=2 ;
    }
}
public static void pattern12(int n)
{
    int temp =1;
    for (int i = 0; i <n ; i++) {

        for (int j = 0; j <=i ; j++) {
            System.out.print(temp+" ");
            temp = temp +1;
        }

        System.out.println();
    }
}
public static void pattern13(int n)
{

    for (int i = 1; i <=n; i++) {
        char ch = 'A';
        for (int j = 1; j <= i; j++) {
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
    }
}
public  static  void pattern14(int n)
{
    for (int i = 1; i <=n; i++) {
        char ch = 'A';
        for (int j = n; j >=i; j--) {
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
    }
}
public static  void pattern15(int n)
{
    char ch = 'A';
    for (int i = 1; i <=n ; i++) {

        for (int j = 1; j <=i ; j++) {
            System.out.print(ch+" ");
        }
        System.out.println();
        ch++;
    }
}
public static void pattern16(int n)
{
    for (int i = 0; i < n; i++) {
        char ch = 'A';
        //print space
        for (int j = 0; j < n-i-1; j++) {
            System.out.print(" ");
        }
        //print star
        for (int j = 0; j <i*2+1 ; j++) {
            System.out.print(ch);
            if(j<(i*2+1)/2)
            {
                ch++;
            }
            else {
                ch--;
            }

        }
        //print space
        for (int j = 0; j < n-i-1; j++) {
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
        //pattern7(4);
        //pattern8(4);
        //pattern9(5);
        //pattern10(5);
        //pattern11(5);
        //pattern12(3);
        //pattern13(3);
        //pattern14(3);
        //pattern15(3);
        //pattern16(3);

    }
}
