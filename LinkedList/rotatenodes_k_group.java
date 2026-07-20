package LinkedList;
public class rotatenodes_k_group {
    static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Step 1: Count nodes to check if we have at least k nodes left
        ListNode current = head;
        int count = 0;
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // Step 2: If we have at least k nodes, reverse them
        if (count == k) {
            ListNode prev = null;
            ListNode next = null;
            current = head;

            // Standard iterative linked list reversal
            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            // Step 3: Recursively connect the rest of the list
            head.next = reverseKGroup(current, k);
            return prev; // 'prev' is the new head of this reversed group
        }

        // Step 4: If less than k nodes are left, return head as-is
        return head;
    }

    // --- Helper methods for testing ---
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        int k = 3;
        ListNode newHead = reverseKGroup(head, k);

        System.out.println("Reversed in groups of " + k + ":");
        printList(newHead);
    }
}
