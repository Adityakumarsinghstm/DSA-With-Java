package Stack;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class MyStack2{
    Node head;
    int size;
    MyStack2()
    {
        size=0;
        head=null;
    }
    int getSize()
    {
        return size;
    }
    boolean isEmpty()
    {
        return (head==null);
    }
    void push(int data)
    {
        Node temp = new Node(data);
        temp.next=head;
        head=temp;
        size++;
    }
    int pop()
    {
        if(head==null)
            return Integer.MAX_VALUE;
        int res = head.data;
        head = head.next;
        size--;
        return size;
    }
    int peek()
    {
        if(head==null)
            return Integer.MAX_VALUE;
        return head.data;
    }
}
public class LinkedListImple {
}
