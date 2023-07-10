package LinkedList;

public class Traversal {
    public static void traversal(ListNode head)
    {
        if(head == null)
        {
            return;
        }
        while (head != null)
        {
            System.out.print(head.getData()+" -> ");
            head = head.getNext();
        }
    }
}
