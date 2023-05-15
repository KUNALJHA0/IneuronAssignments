package ProducerConsumerProblem;

import java.util.Queue;
import java.util.Random;
//private static final int MAX_QUEUE_SIZE = 10;
class Producer implements Runnable {
	//public static final int MAX_QUEUE_SIZE = 10;
	private static final int MAX_QUEUE_SIZE = 10;
    private final Queue<Integer> queue;
    private final Random random;

    public Producer(Queue<Integer> queue, Random random) {
        this.queue = queue;
        this.random = random;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == ProducerConsumerExample.MAX_QUEUE_SIZE) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int num = random.nextInt(100) + 1;
                queue.add(num);
                System.out.println("Produced " + num);

                queue.notifyAll();
            }
        }
  
}
