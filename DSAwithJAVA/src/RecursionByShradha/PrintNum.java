package RecursionByShradha;

public class PrintNum {
    public static void printDec(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int num = 10;
        printDec(num);
    }
}
