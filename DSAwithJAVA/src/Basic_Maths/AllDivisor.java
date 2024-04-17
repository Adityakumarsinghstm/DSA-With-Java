package Basic_Maths;

public class AllDivisor {
    public static int  sumOfAllDivisor(int num)
    {
        int sum =0;
        for(int i = 1;i<=num;i++)
        {
            sum += (num/i)*i;
        }
        return sum;

    }
    public static void main(String[] args) {
         int ans = sumOfAllDivisor(34);
        System.out.println(ans );
    }
}
