package Solutions;

public class StackImplementation {
    private int maxSize; // maximum size of the stack
    private int top; // top of the stack
    private int[] stackArray; // array to hold the stack elements

    // Constructor
    public StackImplementation(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // no elements in the stack yet
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // or throw an exception
        } else {
            int temp = stackArray[top];
            top--;
            return temp;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // or throw an exception
        } else {
            return stackArray[top];
        }
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }
}

