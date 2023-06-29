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

class SubtreeSumResult {
    int sum;
    TreeNode subtreeRoot;

    public SubtreeSumResult(int sum, TreeNode subtreeRoot) {
        this.sum = sum;
        this.subtreeRoot = subtreeRoot;
    }
}

public class Question1 {
    private static int maxSum;

    public static TreeNode findMaxSumSubtree(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        return findMaxSumSubtreeHelper(root).subtreeRoot;
    }

    private static SubtreeSumResult findMaxSumSubtreeHelper(TreeNode node) {
        if (node == null) {
            return new SubtreeSumResult(0, null);
        }

        // Recursively calculate the sum of left and right subtrees
        SubtreeSumResult leftResult = findMaxSumSubtreeHelper(node.left);
        SubtreeSumResult rightResult = findMaxSumSubtreeHelper(node.right);

        // Calculate the sum of the current subtree
        int currentSum = node.val + leftResult.sum + rightResult.sum;

        // Update the maximum sum and subtree root if necessary
        if (currentSum > maxSum) {
            maxSum = currentSum;
            return new SubtreeSumResult(currentSum, node);
        }

        // Return the subtree result with the maximum sum
        if (leftResult.sum > rightResult.sum) {
            return new SubtreeSumResult(leftResult.sum, leftResult.subtreeRoot);
        } else {
            return new SubtreeSumResult(rightResult.sum, rightResult.subtreeRoot);
        }
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(-6);
        root.right.right = new TreeNode(2);

        TreeNode maxSumSubtree = findMaxSumSubtree(root);

        System.out.println("Subtree with maximum sum:");
        printPreorder(maxSumSubtree);
    }

    private static void printPreorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
}

