package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1)
    {
        this.data =data1;
        this.next = null;
    }
}
public class LinkedListStriver {
    private static Node convertArr2LL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static int countOfLL(Node head)
    {
        int count = 0;
        Node temp = head;
        while (temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
    private static  void traverseLL(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    private static int checkIfPresent(Node head,int val)
    {
        Node temp = head;
        while (temp!= null)
        {
            if(temp.data == val) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr ={29,3,12,53,56};
        //Node y = new Node(arr[3]);
        Node head = convertArr2LL(arr);
        Node temp = head;

        traverseLL(head);
        System.out.println();
        int res = countOfLL(head);
        System.out.println(res);

        int ans = checkIfPresent(head, 123);
        if(ans==1)
        {
            System.out.println("Yes , Number present !");
        }
        else {
            System.out.println("No, Number doesn't present !");
        }
    }
}
