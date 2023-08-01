package Mathematics;

public class CheckPrime {
    //navie solution
    public static boolean checkPrime(int num)
    {
        if(num == 1)
        {
            return false;
        }
        else{
            for (int i = 2; i < num; i++) {
                if(num%i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    //Efficient solution

    public static void main(String[] args) {
        int x = 19;
        boolean ans = checkPrime(x);
        System.out.println(ans);
    }
}
