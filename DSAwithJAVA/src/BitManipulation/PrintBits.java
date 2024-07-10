package BitManipulation;

public class PrintBits {
    public static void printBits(int num)
    {
        for (int i = 7; i >= 0 ; i--) {
            System.out.print(((num >> i) & 1)+" ");
        }
        System.out.println();
        printRes(num);
    }
    public static boolean isSet (int num, int bit)
    {
        int res = (num >> 1) & 1;
        return (res == 0 )?false:true;
    }
    public static void printRes(int num)
    {
        if(isSet(num,0)==true)
        {
            System.out.println("Number is Odd");
        }
        else
        {
            System.out.println("Number is Even");
        }
    }
    public static void main(String[] args) {
        printBits(55);
    }
}
