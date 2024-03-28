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
        if(top==cap-1)
        {
            System.out.println("Overflow condition...");
        }
        else {
            top=top+1;
            arr[top]=ele;
        }
    }
    public int pop()
    {

        if(top==-1)
        {
            System.out.println("Underfow.....");
        }
else {
            int res = arr[top];
            top--;
            return res;
        }
return -1;
    }
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty...");
        }
        return arr[top];
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
        MyStack stack1 = new MyStack(5);
//        stack1.push(23);
//        stack1.push(45);
//        stack1.push(90);
//        stack1.push(12);

        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        stack1.push(87);
        stack1.push(98);
        stack1.push(78);
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());

    }
}
