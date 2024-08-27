package Queue;

public class MyQueue {
    int rear;
    int front;
    int size;
    int capacity;
    int[] queue;
    public MyQueue(int capacity)
    {
        queue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        rear = front = -1;
    }
    public boolean isEmpty()
    {
        if(rear == -1)
        {
            return  true;
        }
        return false;
    }
    public boolean isFull()
    {
        if(rear == capacity -1)
        {
            return true;
        }
        return false;
    }
    public int peek(){
        if(front == -1)
        {
            System.out.println("Queue is Empty ");
            return -1;
        }
        return queue[front];
    }
    public void enqueue(int val)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return;
        }
        if(isEmpty())
        {
            rear = 0;
            front = 0;
        }
        else {
            rear++;
        }

        queue[rear]=val;
        size++;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = queue[front];
        if(front == rear)
        {
            front = rear = -1;
        }
        else {
            front ++;
        }
        size--;
        return val;
    }
    public void printQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear ; i++) {
            System.out.print(queue[i]);
            if(i!=rear)
            {
                System.out.print(" , ");
            }

        }
        System.out.println();
    }
    public int size()
    {
        return size;
    }
    public static void main(String[] args) {
        MyQueue queue1 = new MyQueue(5);
        System.out.println(queue1.isEmpty());
        queue1.enqueue(34);
        queue1.enqueue(45);
        queue1.enqueue(89);
        queue1.enqueue(90);
        queue1.enqueue(91);
        System.out.println("Size of queue : "+queue1.size());
        queue1.printQueue();
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.isFull());
        queue1.dequeue();
        System.out.println("Size of queue : " +queue1.size());
        queue1.printQueue();
        System.out.println(queue1.isFull());
        queue1.enqueue(80);
    }
}
