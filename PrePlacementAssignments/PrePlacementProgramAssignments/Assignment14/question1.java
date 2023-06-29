package Assignment14;

//Node class for the linked list
class Node {
 int data;
 Node next;

 Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//Function to create a new linked list using two linked lists
Node createNewLinkedList(Node list1, Node list2) {
 if (list1 == null || list2 == null) {
     return null;
 }

 Node head = null;
 Node current = null;
 Node node1 = list1;
 Node node2 = list2;

 while (node1 != null && node2 != null) {
     // Compare the data of nodes from both lists
     // Add the greater node to the new list
     if (node1.data >= node2.data) {
         Node newNode = new Node(node1.data);
         if (head == null) {
             head = newNode;
             current = newNode;
         } else {
             current.next = newNode;
             current = newNode;
         }
         node1 = node1.next;
     } else {
         Node newNode = new Node(node2.data);
         if (head == null) {
             head = newNode;
             current = newNode;
         } else {
             current.next = newNode;
             current = newNode;
         }
         node2 = node2.next;
     }
 }

 // Add any remaining nodes from list1
 while (node1 != null) {
     Node newNode = new Node(node1.data);
     current.next = newNode;
     current = newNode;
     node1 = node1.next;
 }

 // Add any remaining nodes from list2
 while (node2 != null) {
     Node newNode = new Node(node2.data);
     current.next = newNode;
     current = newNode;
     node2 = node2.next;
 }

 return head;
}

