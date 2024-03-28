package LinkedList;

public class LLShradha1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next=null;
        }


    }
    public static int size =0;
    public static Node head;
    public static Node tail;
    //  Inserting Element at First Position
    public void addFirst(int data)
    {
        Node newNode  = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //  Inserting Element at Last Position
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print()
    {
        if(head == null)
        {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data)
    {
        if(idx==0)
        {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        Node newNode = new Node(data);
        size++;
        while (i<idx-1)
        {
            temp= temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("ll is empty...");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("ll is Empty...");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node preNode = head;
       for(int i =0;i<size-2;i++)
       {
           preNode = preNode.next;
       }
       int val = preNode.next.data;
       preNode.next = null;
       size--;
       tail = preNode;
       return val;
    }
    public int itrSearch(int key)
    {
        int i = 0;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data == key )
        {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key)
    {
        return helper( head, key);
    }
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthFromHead(int n)
    {
        int sz =0;
        Node temp = head;
        while (temp!=null)
        {
            temp = temp.next;
            sz++;
        }
        if(n==sz)
        {
            head=head.next;
            return;
        }
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next!=null)
        {
            slow = slow.next; //+1
            fast = fast.next.next;   //+2
        }
        return slow;  //slow is my mid node
    }
    public boolean checkPalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        //step 1- find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        //step 3 - check left half and right half
        while (right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }
    public static void main(String[] args) {
        LLShradha1 ll = new LLShradha1();
//        ll.print();
//        ll.addFirst(2);
//        ll.print();
//        ll.addFirst(9);
//        ll.print();
//        ll.addLast(7);
//        ll.print();
//        ll.addLast(6);
//        ll.print();
//        ll.add(3,89);
//        ll.print();
        //System.out.println(ll.size);
//        ll.removeFirst();
//        ll.print();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.itrSearch(6));
//        System.out.println(ll.itrSearch(10));
//
//        System.out.println(ll.recSearch(6));
//        System.out.println(ll.recSearch(10));

        //ll.reverse();
//        ll.deleteNthFromHead(3);
//        ll.print();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
//        ll.addFirst(1);


        ll.print();
        System.out.println(ll.checkPalindrome());

    }
}
