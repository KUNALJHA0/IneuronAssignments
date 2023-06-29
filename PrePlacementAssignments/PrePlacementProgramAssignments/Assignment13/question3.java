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
    // Function to remove duplicate nodes from sorted linked list
    Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
public class question3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create the sorted linked list with duplicate nodes
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(43);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(60);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        Node modifiedHead = list.removeDuplicates(head);

        System.out.println("Modified Linked List: ");
        printLinkedList(modifiedHead);
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

