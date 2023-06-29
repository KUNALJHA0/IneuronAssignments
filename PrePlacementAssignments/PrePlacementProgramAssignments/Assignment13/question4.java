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
    // Function to reverse every alternate k nodes in the linked list
    Node reverseAlternateKNodes(Node head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // Reverse the first k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Skip the next k nodes
        while (current != null && count < k * 2) {
            current = current.next;
            count++;
        }

        // Recursively reverse alternate k nodes in the remaining list
        if (current != null) {
            head.next = reverseAlternateKNodes(current, k);
        }

        return prev;
    }
}
WWWW