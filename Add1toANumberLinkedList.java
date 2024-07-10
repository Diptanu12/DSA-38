//class Node {
//    int data;
//    Node next;
//
//    Node(int x) {
//        data = x;
//        next = null;
//    }
//}
//
//class Solution {
//    public static Node addOne(Node head) {
//        // Reverse the linked list
//        head = reverseList(head);
//
//        // Add one to the reversed list
//        Node temp = head;
//        int carry = 1; // Initial carry is 1 since we need to add one
//        Node prev = null;
//
//        while (temp != null) {
//            int sum = temp.data + carry;
//            temp.data = sum % 10;
//            carry = sum / 10;
//            prev = temp;
//            temp = temp.next;
//        }
//
//        // If there is still a carry left, add a new node at the end
//        if (carry > 0) {
//            prev.next = new Node(carry);
//        }
//
//        // Reverse the list again to restore the original order
//        head = reverseList(head);
//
//        return head;
//    }
//
//    private static Node reverseList(Node head) {
//        Node prev = null;
//        Node curr = head;
//        Node next = null;
//
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        return prev;
//    }
//}
//public class Add1toANumberLinkedList {
//    public static void main(String[] args) {
//        // Create a linked list 1 -> 2 -> 3 representing the number 123
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//
//        // Add one to the number
//        head = Solution.addOne(head);
//
//        // Print the resulting linked list
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        // Output should be 1 -> 2 -> 4 representing the number 124
//    }
//}
