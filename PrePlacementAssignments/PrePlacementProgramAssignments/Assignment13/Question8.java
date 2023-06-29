package Assignment13;

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
    // Function to delete a node from a given position in the doubly linked list
    Node deleteNode(Node head, int position) {
        if (head == null) {
            return null;
        }

        // If the head node is to be deleted
        if (position == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }

        int currentPosition = 1;
        Node current = head;

        // Traverse to the position to be deleted
        while (current != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        // If position is out of range
        if (current == null) {
            System.out.println("Position out of range.");
            return head;
        }

        // Adjust the previous and next pointers of adjacent nodes
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        return head;
    }
}
public class Question8 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Create the doubly linked list
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original Doubly Linked List: ");
        printDoublyLinkedList(head);

        int position = 2; // Position of the node to be deleted

        Node modifiedHead = list.deleteNode(head, position);

        System.out.println("Modified Doubly Linked List: ");
        printDoublyLinkedList(modifiedHead);
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

