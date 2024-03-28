package LinkedList;

public class FindCycle {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static int size = 0;
    public static  Node head;
    public static Node tail;

    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next !=null)
        {
            slow = slow.next;   //+1 increment
            fast = fast.next.next;  //+2 increment

            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle()
    {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        boolean cycle = false;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                cycle = true;
                break;
            }
        }
        slow = head;
        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //head.next.next.next.next = head;

        //   1->2->3->4->1
        System.out.println(isCycle());
        head.next  = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = head;

        System.out.println(isCycle());
    }
}
