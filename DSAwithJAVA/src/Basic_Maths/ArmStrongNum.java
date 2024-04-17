package Basic_Maths;

public class ArmStrongNum {
    public static void checkArmStrong(int num)
    {
        int number1 = num;
        int number2 = num;
        int sum = 0;
        int count = 0;
        while (number2 != 0)
        {
            count++;
            number2 = number2/10;
        }
        while(num != 0)
        {
            int n = num%10;
            sum = sum + (int)Math.pow(n,count);
            num= num/10;
        }
        if(number1 == sum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        checkArmStrong(371);
    }
}
