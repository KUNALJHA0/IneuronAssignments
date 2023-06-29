package Assignment13;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    // Function to reverse every k nodes in the linked list
    Node reverseKNodes(Node head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            if (count % k == 0) {
                prev = reverseSubList(prev, curr.next);
                curr = prev.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    // Function to reverse a sublist between the given nodes (inclusive)
    Node reverseSubList(Node start, Node end) {
        Node prev = start.next;
        Node curr = prev.next;

        while (curr != end) {
            prev.next = curr.next;
            curr.next = start.next;
            start.next = curr;
            curr = prev.next;
        }

        return prev;
    }
}
public class question2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create the linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int k = 3; // Number of nodes to reverse

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        Node reversedHead = list.reverseKNodes(head, k);

        System.out.println("Modified Linked List: ");
        printLinkedList(reversedHead);
    }

    // Function to print the linked list
    static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

