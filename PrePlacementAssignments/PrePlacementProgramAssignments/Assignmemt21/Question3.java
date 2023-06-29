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

class DoublyLinkedListNode {
    int val;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class Question3 {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode prev;

    public DoublyLinkedListNode convertToDoublyLinkedList(TreeNode root) {
        head = null;
        prev = null;
        convert(root);
        return head;
    }

    private void convert(TreeNode node) {
        if (node == null) {
            return;
        }

        // Convert left subtree
        convert(node.left);

        // Convert current node
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(node.val);
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
            newNode.prev = prev;
        }
        prev = newNode;

        // Convert right subtree
        convert(node.right);
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Question3 converter = new Question3();
        DoublyLinkedListNode head = converter.convertToDoublyLinkedList(root);

        System.out.println("Doubly Linked List:");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

