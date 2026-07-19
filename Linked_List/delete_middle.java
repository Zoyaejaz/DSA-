package Linked_List;
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class delete_middle {
    public static Node delete(Node head){
        if(head==null || head.next==null) return null;
        Node slow=head;
        Node fast=head;
        fast=fast.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Creating a test linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(5, null);

        System.out.print("Original List: ");
        printList(head);
        Node result = delete(head);
        System.out.print("After Deleting Middle: ");
        printList(result);
    }      

}

