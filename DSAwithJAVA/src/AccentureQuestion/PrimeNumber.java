package AccentureQuestion;

public class PrimeNumber {
    public static boolean checkPrime(int num)
    {
        boolean isPrime = true;
        if(num <= 1)
        {
            isPrime = false;
        }
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if(num % i == 0)
            {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int n = 15;
        boolean res = checkPrime(n);
        System.out.println(res);

    }
}
