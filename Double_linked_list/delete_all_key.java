package Double_linked_list;
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
public class delete_all_key {
    public static Node delete(Node head,int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                if(temp==head){
                    head=head.next;
                }
                Node prevnode=temp.prev;
                Node nextnode=temp.next;
                if(nextnode!=null) nextnode.prev=prevnode;
                if(prevnode!=null) prevnode.next=nextnode;
                temp=nextnode;
            }
            else{
                temp=temp.next;
            }
        }
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
    public static void main(String[] args) {
        // Creating a test doubly linked list: 1 <-> 2 <-> 3 <-> 2 <-> 4 <-> 2 <-> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        System.out.print("Original List: ");
        printList(head);

        int key = 2;
        head = delete(head, key);

        System.out.print("After Deleting all nodes with key " + key + ": ");
        printList(head);
    }
}
