package Assignment19;

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class LinkedListMerger {
    public ListNode mergeKLists(ListNode[] lists) {
        // Create a min-heap or priority queue
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Insert the head nodes of each linked list into the min-heap or priority queue
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.offer(head);
            }
        }

        // Create a dummy node as the head of the merged linked list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge the linked lists by extracting the minimum nodes from the min-heap or priority queue
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;

            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
    }
}
public class question1 {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = createLinkedList(new int[]{1, 4, 5});
        lists[1] = createLinkedList(new int[]{1, 3, 4});
        lists[2] = createLinkedList(new int[]{2, 6});

        LinkedListMerger merger = new LinkedListMerger();
        ListNode mergedList = merger.mergeKLists(lists);

        // Print the merged linked list
        printLinkedList(mergedList);
    }

    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

