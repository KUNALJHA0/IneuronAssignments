package Assignment15;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        // Update the minimum stack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int poppedElement = stack.pop();

        // If the popped element is the minimum, remove it from the minimum stack
        if (poppedElement == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
public class question7 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);

        System.out.println("Minimum Element: " + minStack.getMin()); // Output: 1

        minStack.pop();

        System.out.println("Top Element: " + minStack.top()); // Output: 2

        System.out.println("Minimum Element: " + minStack.getMin()); // Output: 2
    }
}

