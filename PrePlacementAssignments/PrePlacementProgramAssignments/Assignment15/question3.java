package Assignment15;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Function to push an element onto the stack
    public void push(int element) {
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Push the new element into q1
        q1.offer(element);

        // Move all elements back from q2 to q1
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    // Function to pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        // Return the front element of q1 as it is the top element of the stack
        return q1.poll();
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Function to get the top element of the stack without removing it
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        // Return the front element of q1 as it is the top element of the stack
        return q1.peek();
    }
}
public class question3 {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3

        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 2

        System.out.println("Top element: " + stack.top()); // Output: 1

        stack.push(4);

        System.out.println("Top element: " + stack.top()); // Output: 4
    }
}

