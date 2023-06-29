package Assignment20;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Question2 {
    public static TreeNode constructBST(int[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            return null;
        }

        return constructBSTHelper(levelOrder, 0, levelOrder.length - 1);
    }

    private static TreeNode constructBSTHelper(int[] levelOrder, int start, int end) {
        if (start > end) {
            return null;
        }

        // Create a new node with the first element in the level order array
        TreeNode root = new TreeNode(levelOrder[start]);

        // Find the index of the first element greater than the root value
        int index = start + 1;
        while (index <= end && levelOrder[index] <= root.val) {
            index++;
        }

        // Recursively construct the left and right subtrees
        root.left = constructBSTHelper(levelOrder, start + 1, index - 1);
        root.right = constructBSTHelper(levelOrder, index, end);

        return root;
    }

    // Example usage
    public static void main(String[] args) {
        int[] levelOrder = { 7, 4, 9, 2, 6, 8, 10 };

        TreeNode root = constructBST(levelOrder);

        System.out.println("In-order traversal of constructed BST:");
        printInOrder(root);
    }

    private static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}

