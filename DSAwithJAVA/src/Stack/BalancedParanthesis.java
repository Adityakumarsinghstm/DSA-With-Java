package Stack;

import java.util.Stack;

class BalanceParanthesisStack{
    public boolean matching(char a, char b)
    {
        return ((a=='('&& b==')')|| (a=='['&& b==']') || (a=='{' && b=='}'));
    }

    boolean isBalanced(String str)
    {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cr = str.charAt(i);
            if (cr == '(' || cr =='{' || cr=='[')
            {
                s.push(cr);
            }
            else {
                if(s.isEmpty()==true)
                    return false;
                else if(matching(s.peek(),cr)==false)
                    return false;
                else
                   s.pop();
            }
        }
         return (s.empty()==true);
    }
}
public class BalancedParanthesis {
    public static void main(String[] args) {
        BalanceParanthesisStack bs = new BalanceParanthesisStack();

       String str = "[{()]";
       boolean result = bs.isBalanced(str);
        System.out.println(result);
    }
}
