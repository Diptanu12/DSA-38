import java.util.*;

// A node of the doubly linked list
class Node {
    int data;
    Node next, prev;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class GFGx {

    /* Function to delete a node in a Doubly Linked List.
       head --> pointer to head node.
       del --> pointer to node to be deleted. */
    static Node deleteNode(Node head, Node del) {
        // Base case
        if (head == null || del == null)
            return head;

        // If node to be deleted is head node
        if (head == del)
            head = del.next;

        // Change next only if node to be deleted is NOT the last node
        if (del.next != null)
            del.next.prev = del.prev;

        // Change prev only if node to be deleted is NOT the first node
        if (del.prev != null)
            del.prev.next = del.next;

        return head;
    }

    /* Function to delete all occurrences of the given key 'x' */
    static Node deleteAllOccurOfX(Node head, int x) {
        // If list is empty
        if (head == null)
            return null;

        Node current = head;

        // Traverse the list to the end
        while (current != null) {
            // If node found with the value 'x'
            if (current.data == x) {
                Node next = current.next;
                head = deleteNode(head, current);
                current = next;
            } else {
                // Simply move to the next node
                current = current.next;
            }
        }

        return head;
    }

    /* Function to insert a node at the beginning of the Doubly Linked List */
    static Node push(Node head, int new_data) {
        // Allocate node
        Node new_node = new Node(new_data);

        // Link the old list of the new node
        new_node.next = head;

        // Change prev of head node to new node
        if (head != null)
            head.prev = new_node;

        // Move the head to point to the new node
        head = new_node;

        return head;
    }

    /* Function to print nodes in a given doubly linked list */
    static void printList(Node temp) {
        if (temp == null) {
            System.out.print("Doubly linked list is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        // Start with the empty list
        Node head = null;

        // Create the doubly linked list: 2<->2<->10<->8<->4<->2<->5<->2
        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 2);
        head = push(head, 4);
        head = push(head, 8);
        head = push(head, 10);
        head = push(head, 2);
        head = push(head, 2);

        System.out.println("Original Doubly linked list: ");
        printList(head);

        int x = 2;

        // Delete all occurrences of 'x'
        head = deleteAllOccurOfX(head, x);
        System.out.println("Doubly linked list after deletion of " + x + ":");
        printList(head);
    }
}
