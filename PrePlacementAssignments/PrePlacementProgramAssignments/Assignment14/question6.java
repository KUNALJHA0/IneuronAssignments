package Assignment14;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    // Function to merge two sorted linked lists in place
    Node mergeSortedLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node dummy = new Node(0);
        Node current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Append any remaining nodes from list1
        if (head1 != null) {
            current.next = head1;
        }

        // Append any remaining nodes from list2
        if (head2 != null) {
            current.next = head2;
        }

        return dummy.next;
    }
}
public class question6 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create the first sorted linked list
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // Create the second sorted linked list
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("First Linked List: ");
        printLinkedList(head1);

        System.out.println("Second Linked List: ");
        printLinkedList(head2);

        Node mergedHead = list.mergeSortedLists(head1, head2);

        System.out.println("Merged Linked List: ");
        printLinkedList(mergedHead);
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

