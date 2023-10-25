package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Maria");
        queue.offer("Aleksandr");
        System.out.println(queue);
        System.out.println(queue.remove()); //работа с первым элементом в
        // очереди
        queue.remove("Ivan"); //удаление из середины очереди, но не имеет
        // смысла.
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());
//        System.out.println(queue);

    }
}
