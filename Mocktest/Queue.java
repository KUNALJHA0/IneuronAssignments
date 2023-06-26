package Solutions;

public class Queue {
    private int maxSize; // maximum size of the queue
    private int front; // front of the queue
    private int rear; // rear of the queue
    private int[] queueArray; // array to hold the queue elements
    private int currentSize; // current number of elements in the queue

    // Constructor
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Add an element to the rear of the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
        }
    }

    // Remove an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; // or throw an exception
        } else {
            int temp = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return temp;
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Get the size of the queue
    public int size() {
        return currentSize;
    }
}

