package AccentureQuestion;

public class ReverseNumber {
    public static int reverse(int num)
    {
        int ans = 0;
        while (num > 0)
        {
            int n = num%10;
            ans = (ans*10)+n;
            num = num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 987654;
        int ans = reverse(num);
        System.out.println(ans);
    }
}
