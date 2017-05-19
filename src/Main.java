import java.util.Queue;

/**
 * Test created collection
 */
public class Main {
    public static void main(String[] args) {
        BoundedQueue<String> bq = new BoundedQueue<>(5);

        bq.add("A");
        bq.add("B");
        bq.add("C");
        bq.add("D");
        bq.add("F");
        bq.add("G");

        System.out.println(bq + " size : " + bq.size());

        BoundedQueue<Integer> queue = new BoundedQueue<>();

        for (int i = 1; i <= 20;i++) {
            queue.add(i);
        }

        System.out.print(queue);

        System.out.println(" size : " + queue.size());
    }
}
