package Basic_Maths;

public class PrintDigit {
    public static void printDigits(int n)
    {
        int count = 0;
        while (n != 0)
        {
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n = n/10;
            count++;
        }
        System.out.println("Total digits present in this number :"+count);
    }
    public static void main(String[] args) {
        printDigits(2345);

    }
}
