package LeetCodeDailyChallenge;

import java.util.ArrayList;
import java.util.Stack;

public class LeetCode1190 {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(Character ch : s.toCharArray()){
            if(ch=='(' || ch!=')')
            {
                stack.push(ch);
            }
            else {
                ArrayList<Character> list = new ArrayList<>();
                while (!stack.isEmpty() && stack.pop()!='(')
                {
                    list.add(stack.pop());
                }
                stack.pop();
                for(char c : list)
                {
                    stack.push(c);
                }
            }
        }

        while(!stack.isEmpty())
        {
            res.insert(0,stack.pop());
        }
        return res.toString();
    }
}
