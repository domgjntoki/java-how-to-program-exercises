package C16Colecoes.exercicios;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Fredson Sumi
 */
public class PriorityQueueDoubleInverso {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = 
                new PriorityQueue<>(Collections.reverseOrder());
        
        queue.offer(11.2);
        queue.offer(2.4);
        queue.offer(25.22);;
        while (queue.size() > 0) {
            System.out.printf("%,.1f ", queue.peek());
            queue.poll();
           
        }
        
        System.out.println();
    }
}
