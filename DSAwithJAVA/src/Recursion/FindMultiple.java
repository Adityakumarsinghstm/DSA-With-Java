package Recursion;

public class FindMultiple {
    public static void findMultiple(int num, int k)
    {
        int result = 0;
        if(k==1)
        {
            System.out.println(num);
        }
        else
        {
           findMultiple(num,k-1);
            System.out.println(num * k);
        }

    }
    public static void main(String[] args) {
        int num  = 4;
        int k =5;
    findMultiple(num,k);
    }
}
