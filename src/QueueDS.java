import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Clark Kent");
        queue.offer("Bruce Wayne");
        queue.offer("Diana Prince");
        queue.offer("Barry Allen");
        queue.offer("Arthur Curry");
        queue.offer("Victor Stone");

        System.out.println(queue.peek());
        queue.poll();        
        queue.poll();        
        queue.poll();        
        System.out.println(queue);

        // Methods that Queues inherit from the Collection class 
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Arthur Curry"));
    }
}