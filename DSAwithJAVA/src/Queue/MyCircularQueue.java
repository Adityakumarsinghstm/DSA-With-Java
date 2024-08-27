package Queue;

public class MyCircularQueue {
    int rear;
    int front;
    int size;
    int capacity;
    int[] circularQueue;
    public MyCircularQueue(int capacity)
    {
        circularQueue = new int[capacity];
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
        if((front==0 && rear == capacity -1)||(front!=0 && rear==(front-1)%(capacity)))
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
        return circularQueue[front];
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
        } else if (rear == capacity-1 && front!=0) {
            rear =0;
        } else {
            rear++;
        }

        circularQueue[rear]=val;
        size++;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = circularQueue[front];
        if(front == rear)
        {
            front = rear = -1;
        } else if (front == capacity -1) {
            front = 0;
        } else {
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
        if(rear<=front)
        {
            for (int i = front; i <= capacity-1 ; i++) {
                System.out.print(circularQueue[i]);
                if(i!=rear)
                {
                    System.out.print(" , ");
                }
            }
            for (int i = 0; i <= rear ; i++) {
                System.out.print(circularQueue[i]);
                if(i!=rear)
                {
                    System.out.print(" , ");
                }

            }
        }
        else {

        for (int i = front; i <= rear ; i++) {
            System.out.print(circularQueue[i]);
            if(i!=rear)
            {
                System.out.print(" , ");
            }
        }

        }
        System.out.println();
    }
    public int size()
    {
        return size;
    }
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        System.out.println(myCircularQueue.isEmpty());
        myCircularQueue.enqueue(34);
        myCircularQueue.enqueue(45);
        myCircularQueue.enqueue(89);
        myCircularQueue.enqueue(90);
        myCircularQueue.enqueue(91);
        System.out.println("Size of queue : "+myCircularQueue.size());
        myCircularQueue.printQueue();
        System.out.println(myCircularQueue.isEmpty());
        System.out.println(myCircularQueue.isFull());
        myCircularQueue.dequeue();
        System.out.println("Size of queue : " +myCircularQueue.size());
        myCircularQueue.printQueue();
        System.out.println(myCircularQueue.isFull());
        myCircularQueue.enqueue(80);
        myCircularQueue.printQueue();
        System.out.println("Size of queue : " +myCircularQueue.size());
        myCircularQueue.enqueue(92);
        myCircularQueue.dequeue();
        myCircularQueue.printQueue();
        System.out.println("Size of queue : " +myCircularQueue.size());
        myCircularQueue.enqueue(92);
        myCircularQueue.printQueue();


    }
}

