package Double_linked_list;
// Definition for a Node of a Doubly Linked List
class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class delete_duplicates {

    // Method to remove duplicates from a sorted doubly linked list
    public static Node removeDuplicates(Node head) {
        // Base case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            // If current node's value is equal to the next node's value
            if (current.val == current.next.val) {
                Node duplicate = current.next;
                
                // Adjust the forward link of the current node
                current.next = duplicate.next;
                
                // Adjust the backward link of the node after the duplicate (if it exists)
                if (duplicate.next != null) {
                    duplicate.next.prev = current;
                }
            } else {
                // Only advance current if we didn't delete a node 
                // (handles cases with 3 or more identical elements back-to-back)
                current = current.next;
            }
        }
        return head;
    }

    // Helper method to create a doubly linked list from an array
    public static Node createDoublyLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        return head;
    }

    // Helper method to print the doubly linked list forward
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " <-> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample sorted array with multiple duplicate entries
        int[] sortedData = {1, 1, 1, 2, 3, 3, 4, 5, 5, 5};

        // Construct the doubly linked list
        Node head = createDoublyLinkedList(sortedData);

        System.out.println("Original Doubly Linked List:");
        printList(head);
        System.out.println("----------------------------------------");

        // Remove duplicates
        head = removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}