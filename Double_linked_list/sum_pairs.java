package Double_linked_list;
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
public class sum_pairs {
    public static void findPairsWithSum(Node head, int target) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // 1. Initialize 'left' pointer at the head
        Node left = head;
        
        // 2. Find the tail of the list to initialize 'right' pointer
        Node right = head;
        while (right.next != null) {
            right = right.next;
        }

        boolean found = false;
        System.out.println("Pairs that add up to " + target + ":");

        // 3. Move pointers toward each other until they meet or cross
        while (left != null && right != null && left != right && left.next != right) {
            int currentSum = left.val + right.val;

            if (currentSum == target) {
                found = true;
                System.out.println("(" + left.val + ", " + right.val + ")");
                
                // Move both pointers inward
                left = left.next;
                right = right.prev;
            } 
            else if (currentSum < target) {
                // Sum is too small, move left pointer to a larger value
                left = left.next;
            } 
            else {
                // Sum is too large, move right pointer to a smaller value
                right = right.prev;
            }
        }

        if (!found) {
            System.out.println("No pairs found.");
        }
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

    // Helper method to print the doubly linked list (for verification)
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " <-> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Input array MUST be sorted for the two-pointer approach to work
        int[] sortedData = {1, 2, 4, 5, 6, 8, 9};
        int targetSum = 7;

        // Construct the doubly linked list
        Node head = createDoublyLinkedList(sortedData);

        System.out.print("Doubly Linked List: ");
        printList(head);
        System.out.println("------------------------------------");

        // Find the pairs
        findPairsWithSum(head, targetSum);
    }
}
