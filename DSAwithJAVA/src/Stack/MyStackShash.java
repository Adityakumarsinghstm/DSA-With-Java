package Stack;

import java.util.Stack;

public class MyStackShash {
    int [] stack;
    int size;
    int top;
    public MyStackShash(int stackSize)
    {
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }
    // Element insertion operation
    public void push(int element)
    {
        if(top >= size)
        {
            System.out.println("Stack is full - overflow");
        }
        top++;
        stack[top] = element;
    }
    // Check the stack is empty or not
    public boolean isEmpty()
    {
        return top<=-1;
    }
    // Returning the size of the stack
    public int size()
    {
        return top+1;
    }
    // Returning the top element of the stack
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }
    // Returning the top element as well as deleting
    public int pop(){
        int val = peek();
        if(val !=Integer.MIN_VALUE){
            top --;
        }
        return  val;
    }

    public void printStack()
    {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if(i!=top)
            {
                System.out.print(" , ");
            }
        }
        System.out.println();

    }
    public boolean isValid(String s )
    {
        int n = s.length();
        if(n%2!=0)
        {
            return false;
        }
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch=='{')
            {
                stack1.push(ch);
            }
            else{
                if(stack1.isEmpty())
                {
                    return false;
                }
                char top = stack1.peek();
                if(ch == ')' && top != '(')
                {
                    return false;
                }
                else if(ch == ']' && top != '[')
                {
                    return false;
                }
                else if(ch == '}' && top != '{')
                {
                    return false;
                }
                else{
                    stack1.pop();
                }
            }
        }
        return (stack1.isEmpty());

    }
    public static void main(String[] args) {
        int n = 5;
        MyStackShash stack = new MyStackShash(n);
        System.out.println(stack.isEmpty());
        stack.push(9);
        stack.printStack();
        stack.push(1);
        stack.printStack();
        stack.push(8);
        stack.printStack();
    }
}
