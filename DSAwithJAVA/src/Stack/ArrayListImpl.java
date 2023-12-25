package Stack;

import java.util.ArrayList;

class Mystack{
    ArrayList<Integer> arl = new ArrayList<>();
    public void push(int x)
    {
        arl.add(x);
    }
    public int pop()
    {
        int res = arl.get(arl.size()-1);
        arl.remove(arl.size()-1);
        return res;
    }
    public int peek()
    {
        return arl.get(arl.size()-1);
    }
    public int size()
    {
        return arl.size();
    }
    public boolean isEmpty()
    {
        return arl.isEmpty();
    }
}
public class ArrayListImpl {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        mystack.push(12);
        mystack.push(67);
        mystack.push(78);
        mystack.push(89);
        System.out.println(mystack.pop());
        System.out.println(mystack.peek());
        System.out.println(mystack.size());
        System.out.println(mystack.isEmpty());
    }
}
