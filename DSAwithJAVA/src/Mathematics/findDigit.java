package Mathematics;

public class findDigit {
    public static int findDigit(int x)
    {
        int count = 0;
        while (x>0)
        {
            x = x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 235;
        int res = findDigit(x);
        System.out.println(res);
    }
}
