package Assignment16;

import java.util.Stack;

class PostfixEvaluator {
    // Function to evaluate a postfix expression and return the final value
    static int evaluatePostfix(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfixExpression.length(); i++) {
            char ch = postfixExpression.charAt(i);

            if (Character.isDigit(ch)) {
                // If the character is an operand, push it onto the stack
                stack.push(ch - '0'); // Convert char to int and push onto stack
            } else {
                // If the character is an operator, pop the top two elements from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the corresponding arithmetic operation based on the operator
                int result = performOperation(operand1, operand2, ch);

                // Push the result back onto the stack
                stack.push(result);
            }
        }

        // The final result will be the top element of the stack
        return stack.pop();
    }

    // Function to perform arithmetic operation based on the operator
    static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
public class Question6 {
    public static void main(String[] args) {
        String postfixExpression = "82+4*5+";

        int result = PostfixEvaluator.evaluatePostfix(postfixExpression);

        System.out.println("Postfix Expression: " + postfixExpression); // Output: 82+4*5+
        System.out.println("Result: " + result); // Output: 42
    }
}

