package Assignment15;

import java.util.Stack;

class StackUtils {
    // Function to reverse a stack using recursion
    static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int element = stack.pop();

            // Recursively reverse the remaining stack
            reverseStack(stack);

            // Insert the popped element at the bottom of the reversed stack
            insertAtBottom(stack, element);
        }
    }

    // Function to insert an element at the bottom of a stack
    static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, element);
            stack.push(temp);
        }
    }
}
public class question4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack); // Output: [5, 4, 3, 2, 1]

        StackUtils.reverseStack(stack);

        System.out.println("Reversed Stack: " + stack); // Output: [1, 2, 3, 4, 5]
    }
}

