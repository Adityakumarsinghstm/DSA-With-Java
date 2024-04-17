package Basic__Recursion;

public class SumOfN {
    public static long sumFirstN(long n){
        return (n*(n+1))/2;
    }

    public static void main(String[] args) {
        long n = 34;
        long ans = sumFirstN(n);
        System.out.println(ans);
    }
}
