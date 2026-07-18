package Linked_List;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class length_of_loop {
    public static boolean detect(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)  findlength(slow,fast);
        }
        return false;
    }
    public static int findlength(Node slow,Node fast){
        int cnt=1;
        fast=fast.next;
        while(slow!=fast){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }
    private static Node buildlist(int[] values){
        if(values == null || values.length == 0) return null;
        Node head = new Node(values[0]);
        Node tail = head;
        for(int i = 1; i < values.length; i++){
            tail.next = new Node(values[i]);
            tail = tail.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // 1. Test case: Linear List (No Loop)
        Node head = buildlist(arr);
        System.out.println("Loop detected in linear list? " + detect(head)); // Expected: false

        // 2. Test case: Creating a loop manually
        // Let's connect the tail node (7) back to the node with data '4'
        Node tail = head;
        Node loopNode = null;
        
        while (tail.next != null) {
            if (tail.data == 4) {
                loopNode = tail; // Keep track of the node we want to loop back to
            }
            tail = tail.next;
        }
        // Connect the last node to the 4th node
        if (tail != null && loopNode != null) {
            tail.next = loopNode;
        }

        System.out.println("Loop detected after creating a cycle? " + detect(head)); // Expected: true
    }
}
