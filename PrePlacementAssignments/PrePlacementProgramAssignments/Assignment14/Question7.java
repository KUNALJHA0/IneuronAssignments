package Assignment14;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList {
    // Function to reverse the doubly linked list
    Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        // Swap prev and next pointers of all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Set the new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
public class Question7 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Create the doubly linked list
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Original Doubly Linked List: ");
        printDoublyLinkedList(head);

        Node reversedHead = list.reverse(head);

        System.out.println("Reversed Doubly Linked List: ");
        printDoublyLinkedList(reversedHead);
    }

    // Function to print the doubly linked list
    static void printDoublyLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

