package Basic_Maths;

public class ArmStrongNum {
    public static void checkArmStrong(int num)
    {
        int number = num;
        int sum = 0;
        while(num != 0)
        {
            int n = num%10;
            sum = sum + (n*n*n);
            n= n/10;
        }
        if(number == sum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void main(String[] args)
    {
        checkArmStrong(1634);
    }
}
