package Linked_List;

public class rotate_linkedlist {
    
    static class Node {
        int data;
        Node next;
        
        // Fixed: added 'int' type to data
        Node(int data) { 
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotate(Node head, int k) {
        // Base cases: empty list, single node, or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node tail = head;
        int len = 1;

        // Traverse to find the tail and calculate length
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        // Optimize rotation count
        k = k % len;
        if (k == 0) return head;

        // Connect tail to head to form a circular list
        tail.next = head;

        // Find the new tail (at len - k position)
        Node current = findNode(head, len - k);
        
        // Set new head and break the ring
        head = current.next;
        current.next = null;

        return head;
    }

    public static Node findNode(Node temp, int k) {
        int cnt = 1;
        while (temp != null) {
            if (cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        int k = 2;
        head = rotate(head, k);

        System.out.print("Rotated List (k=" + k + "): ");
        printList(head);
    }
}