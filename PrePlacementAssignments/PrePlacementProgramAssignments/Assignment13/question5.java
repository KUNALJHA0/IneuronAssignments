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
    // Function to delete the last occurrence of a key from the linked list
    Node deleteLastOccurrence(Node head, int key) {
        if (head == null) {
            return null;
        }

        Node lastOccurrence = null;
        Node current = head;
        Node previous = null;

        // Traverse the linked list to find the last occurrence of the key
        while (current != null) {
            if (current.data == key) {
                lastOccurrence = current;
            }
            previous = current;
            current = current.next;
        }

        // If the last occurrence is found, delete it
        if (lastOccurrence != null) {
            if (lastOccurrence == head) {
                head = head.next;
            } else {
                previous.next = lastOccurrence.next;
            }
        }

        return head;
    }
}

