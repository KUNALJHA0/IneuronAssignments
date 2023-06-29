package Assignment16;

import java.util.Arrays;
import java.util.Stack;

class ArrayUtils {
    // Function to find the next greater element for each element in the array
    static long[] nextGreaterElement(long[] arr) {
        int n = arr.length;
        long[] result = new long[n];
        Arrays.fill(result, -1); // Initialize all elements with -1

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Process elements until a greater element is found
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        long[] arr = {4, 5, 2, 25, 10, 8, 6};

        long[] result = ArrayUtils.nextGreaterElement(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}

