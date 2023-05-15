package ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerExample {
    private static final int MAX_QUEUE_SIZE = 10;
    private static final int NUM_PRODUCERS = 1;
    private static final int NUM_CONSUMERS = 1;
	

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random();

        Thread[] producers = new Thread[NUM_PRODUCERS];
        Thread[] consumers = new Thread[NUM_CONSUMERS];

        for (int i = 0; i < NUM_PRODUCERS; i++) {
            producers[i] = new Thread(new Producer(queue, random));
            producers[i].start();
        }

        for (int i = 0; i < NUM_CONSUMERS; i++) {
            consumers[i] = new Thread(new Consumer(queue));
            consumers[i].start();
        }
    }
}
