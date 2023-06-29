package Assignmemt21;

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
    public static int findDistance(TreeNode root, int node1, int node2) {
        TreeNode lca = findLCA(root, node1, node2);
        int distance1 = findDistanceFromNode(lca, node1, 0);
        int distance2 = findDistanceFromNode(lca, node2, 0);
        return distance1 + distance2;
    }

    private static TreeNode findLCA(TreeNode node, int node1, int node2) {
        if (node == null) {
            return null;
        }

        if (node.val > node1 && node.val > node2) {
            return findLCA(node.left, node1, node2);
        }

        if (node.val < node1 && node.val < node2) {
            return findLCA(node.right, node1, node2);
        }

        return node;
    }

    private static int findDistanceFromNode(TreeNode node, int target, int distance) {
        if (node == null) {
            return -1; // Target node not found
        }

        if (node.val == target) {
            return distance;
        }

        if (node.val > target) {
            return findDistanceFromNode(node.left, target, distance + 1);
        }

        return findDistanceFromNode(node.right, target, distance + 1);
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.right.left.right = new TreeNode(7);

        int node1 = 2;
        int node2 = 7;

        int distance = findDistance(root, node1, node2);
        System.out.println("Distance between " + node1 + " and " + node2 + ": " + distance);
    }
}

