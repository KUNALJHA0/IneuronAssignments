package Assignment20;

import java.util.LinkedList;
import java.util.Queue;

public class Question3 {
    public static boolean isLevelOrderBST(int[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            return true;
        }

        int n = levelOrder.length;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(levelOrder[0]);

        int i = 1;
        while (i < n) {
            int current = queue.poll();

            // Find the index where the left subtree ends and right subtree begins
            int leftIndex = -1;
            for (int j = i; j < n; j++) {
                if (levelOrder[j] < current) {
                    leftIndex = j;
                } else {
                    break;
                }
            }

            // Check if the elements in the right subtree are greater than the current node
            for (int j = leftIndex + 1; j < n; j++) {
                if (levelOrder[j] < current) {
                    return false;
                }
            }

            // Enqueue the elements of the left and right subtrees
            for (int j = i; j <= leftIndex; j++) {
                queue.offer(levelOrder[j]);
            }

            // Update the index for the next iteration
            i = leftIndex + 1;
        }

        return true;
    }

    // Example usage
    public static void main(String[] args) {
        int[] levelOrder1 = { 7, 4, 9, 2, 6, 8, 10 };
        boolean isBST1 = isLevelOrderBST(levelOrder1);
        System.out.println("Is levelOrder1 a valid level order of BST? " + isBST1);

        int[] levelOrder2 = { 7, 4, 9, 2, 1, 6, 8, 10 };
        boolean isBST2 = isLevelOrderBST(levelOrder2);
        System.out.println("Is levelOrder2 a valid level order of BST? " + isBST2);
    }
}
