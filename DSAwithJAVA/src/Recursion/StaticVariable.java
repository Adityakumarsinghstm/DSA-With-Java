package Recursion;

public class StaticVariable {
    int x = 0;
    public  int func(int n)
    {
        if(n>0)
        {
            x++;
            return func(n-1)+x;

        }
        return  0;
    }
    public static int func1(int n){
        if(n>0)
        {
            return func1(n-1)+n;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 5;
        StaticVariable sv = new StaticVariable();
        int ans = sv.func(5);
        System.out.println("Answer is : "+ans);

        int ans1 = func1(5);
        System.out.println("Answer of func1 is : "+ans1);
    }
}
