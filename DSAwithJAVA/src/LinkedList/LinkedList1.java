package LinkedList;

public class LinkedList1 {
    Node head;
    //creation of node
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
           }
       }
        //implementation of new Node at End
        public void insertAtEnd(int newData)
        {
            Node newNode = new Node(newData);

          //LinkList is empty
            if (head == null) {
                head = new Node(newData);
                return;
            }
            //Linklist is not empty
            newNode.next = null;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return;
        }

    //implementation of newNode at beginning of LinkedList
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //implementation of newNode at any node
    public void insertAfer(Node pre_node, int newData) {
        if (pre_node == null) {
            System.out.println("The previous node can not be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = pre_node.next;
        pre_node.next = newNode;
    }

    //Implementation of Deletion of Node in LinkedList
    void deleteNode(int position)
    {
       //Linkdlist empty
        if(head == null)
        {
            return;
        }
        //Deletion at begining
        Node temp = head;
        if(position == 0)
        {
            head = temp.next;
        }
        for(int i=0;temp!=null && i<position-1;i++)
        {
            temp = temp.next;
        }
        if(temp == null && temp.next.next == null)
        {
            return;
        }
        temp.next = temp.next.next;
    }
        //implementation of displaying the linklist
       public void displayLL()
       {
           Node current = head;
           while (current != null)
           {
               System.out.print(current.data + " ");
               current = current.next;
           }
       }

    public static void main(String[] args) {
         LinkedList1 llist = new LinkedList1();
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);
        llist.insertAtEnd(4);

        System.out.println("Before adding 10");
        llist.displayLL();
        System.out.println();

        llist.insertAtEnd(5);
        System.out.println("Before adding 10");
        llist.displayLL();
        System.out.println();


        llist.insertAtBeginning(1);
        llist.insertAtBeginning(9);
        llist.displayLL();
        System.out.println();

        llist.insertAfer(llist.head.next.next,678);
        llist.displayLL();
        System.out.println();

        llist.deleteNode(3);
        System.out.println("Deletion of a node from linkdlist");
        llist.displayLL();
        System.out.println();

        llist.deleteNode(5);
        System.out.println("Deletion of a node from linkdlist");
        llist.displayLL();
        System.out.println();
    }
}
