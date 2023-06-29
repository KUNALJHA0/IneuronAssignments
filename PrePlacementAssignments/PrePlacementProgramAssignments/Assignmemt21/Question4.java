package Assignmemt21;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}

public class Question4 {
    public static void connectNodes(TreeNode root) {
        if (root == null) {
            return;
        }

        // Start with the root node
        TreeNode levelStart = root;

        while (levelStart != null) {
            // Create a dummy node for the next level
            TreeNode dummy = new TreeNode(0);
            TreeNode current = dummy;

            // Traverse the current level
            while (levelStart != null) {
                if (levelStart.left != null) {
                    current.next = levelStart.left;
                    current = current.next;
                }
                if (levelStart.right != null) {
                    current.next = levelStart.right;
                    current = current.next;
                }
                levelStart = levelStart.next;
            }

            // Move to the next level
            levelStart = dummy.next;
        }
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        connectNodes(root);

        System.out.println("Node connections:");
        System.out.println("Node 1: " + (root.next != null ? root.next.val : "null"));
        System.out.println("Node 2: " + (root.left.next != null ? root.left.next.val : "null"));
        System.out.println("Node 3: " + (root.right.next != null ? root.right.next.val : "null"));
        System.out.println("Node 4: " + (root.left.left.next != null ? root.left.left.next.val : "null"));
        System.out.println("Node 5: " + (root.left.right.next != null ? root.left.right.next.val : "null"));
        System.out.println("Node 7: " + (root.right.right.next != null ? root.right.right.next.val : "null"));
    }
}
