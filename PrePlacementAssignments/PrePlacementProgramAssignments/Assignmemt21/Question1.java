package Assignmemt21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Question1 {
    public static void convertBinaryTreeToBST(TreeNode root) {
        // Step 1: Traverse the binary tree and store the values in a list
        List<Integer> values = new ArrayList<>();
        traverseTree(root, values);

        // Step 2: Sort the values in ascending order
        Collections.sort(values);

        // Step 3: Replace node values with sorted values
        replaceValues(root, values.iterator());
    }

    private static void traverseTree(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        traverseTree(node.left, values);
        values.add(node.value);
        traverseTree(node.right, values);
    }

    private static void replaceValues(TreeNode node, Iterator<Integer> iterator) {
        if (node == null) {
            return;
        }
        replaceValues(node.left, iterator);
        node.value = iterator.next();
        replaceValues(node.right, iterator);
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println("Binary Tree before conversion to BST:");
        inorderTraversal(root);

        convertBinaryTreeToBST(root);

        System.out.println("\nBinary Search Tree after conversion:");
        inorderTraversal(root);
    }

    private static void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);
    }
}
