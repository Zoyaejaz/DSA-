package Double_linked_list;

import java.util.Stack;

class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }
    
    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class Reverse {
    
    // Wrapped your logic inside a proper static method
    public static Node reverseDLL(Node head) {
        if (head == null) return null;
        
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        
        // Pass 1: Push data to stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
        
        // Pass 2: Pop data back to nodes
        current = head;
        while (current != null) {
            current.data = stack.pop();
            current = current.next;
        }
        
        // Return the head of the modified list
        return head;
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // The main function
    public static void main(String[] args) {
        // Constructing a list: 10 <-> 20 <-> 30 <-> 40
        Node head = new Node(10);
        Node second = new Node(20, null, head);
        head.next = second;
        
        Node third = new Node(30, null, second);
        second.next = third;
        
        Node fourth = new Node(40, null, third);
        third.next = fourth;

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        head = reverseDLL(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}