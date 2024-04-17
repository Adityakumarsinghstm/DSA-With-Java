package Basic_Maths;

public class CheckPrime {
    public static boolean isPrime(int num)
    {
        if(num == 1)
        {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       boolean ans = isPrime(8);
        System.out.println(ans);
    }
}
