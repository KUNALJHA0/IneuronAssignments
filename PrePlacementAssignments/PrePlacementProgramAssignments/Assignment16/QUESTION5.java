package Assignment16;

import java.util.Stack;

class StringUtils {
    // Function to reverse a string using a stack
    static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();

        // Pop each character from the stack and append it to the new string
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
}
public class QUESTION5 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        String reversedStr = StringUtils.reverseString(str);

        System.out.println("Original String: " + str); // Output: Hello, World!
        System.out.println("Reversed String: " + reversedStr); // Output: !dlroW ,olleH
    }
}

