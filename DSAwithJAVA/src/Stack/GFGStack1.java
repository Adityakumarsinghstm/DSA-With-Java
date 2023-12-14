package Stack;
class MyStack{
    int arr[];
    int top;
    int cap;
    MyStack(int c)
    {
        top=-1;
        cap=c;
        arr= new int[cap];
    }
    public void push(int ele)
    {
        top=top+1;
        arr[top]=ele;
    }
    public int pop()
    {
        int res = arr[top];
        top--;
        return res;
    }
    public int size()
    {
        return top+1;
    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
}
public class GFGStack1 {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack(8);
        stack1.push(23);
        stack1.push(45);
        stack1.push(90);
        stack1.push(12);

        System.out.println(stack1.pop());
        stack1.push(87);
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());

    }
}
