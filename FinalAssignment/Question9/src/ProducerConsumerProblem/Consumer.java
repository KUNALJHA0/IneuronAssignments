package ProducerConsumerProblem;
import java.util.Queue;

class Consumer implements Runnable {
    private final Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        int sum = 0;

        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int num = queue.remove();
                System.out.println("Consumed " + num);
                sum += num;

                queue.notifyAll();
            }

            if (sum > 0) {
                System.out.println("Sum of numbers: " + sum);
                sum = 0;
            }
        }
    }

}
