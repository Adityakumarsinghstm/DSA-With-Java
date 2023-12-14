package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImple {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(23);
        queue.add(89);
        queue.add(76);
        queue.add(20);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
