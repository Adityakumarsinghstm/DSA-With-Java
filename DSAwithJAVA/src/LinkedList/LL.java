package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertAtFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
          tail = head;
        }
        size += 1;
    }
    public void insertAtLast(int val)
    {
        Node node = new Node(val);
        if(tail == null)
        {
            insertAtFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index)
    {
        if(index == 0)
        {
            insertAtFirst(val);
            return;
        }
        if(index == size)
        {
            insertAtLast(val);
            return;
        }

    }
    public void display()
    {
        Node temp = head;
        while (temp!= null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
