package Assignment15;

import java.util.Arrays;
import java.util.Stack;

class ArrayUtils {
    // Function to find the nearest smaller number on the left side for each element in the array
    static int[] nearestSmallerNumber(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize all elements with -1

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Process elements until a smaller element is found
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            // If a smaller element is found, update the result
            if (!stack.isEmpty()) {
                result[i] = arr[stack.peek()];
            }

            stack.push(i);
        }

        return result;
    }
}
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        int[] result = ArrayUtils.nearestSmallerNumber(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Nearest Smaller Numbers on Left: " + Arrays.toString(result));
    }
}
