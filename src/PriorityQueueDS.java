import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDS {
    public static void main(String[] args) throws Exception {
        Queue<Double> GPA = new PriorityQueue<>();

       GPA.offer(3.0);
       GPA.offer(4.0);
       GPA.offer(1.25);
       GPA.offer(2.75);

       while(!GPA.isEmpty()) {
            System.out.println(GPA.poll());
       }

       Queue<String> Grades = new PriorityQueue<>(Collections.reverseOrder());

        Grades.offer("B");
        Grades.offer("C");
        Grades.offer("A");
        Grades.offer("D");


       while(!Grades.isEmpty()) {
              System.out.println(Grades.poll());
       }
    }
}
