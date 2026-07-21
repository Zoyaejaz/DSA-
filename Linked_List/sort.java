package Linked_List;
import java.util.ArrayList;
import java.util.Collections;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class sort {
    public static Node sorting(Node head){
        ArrayList<Integer> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        int i=0;
        temp=head;
        while(temp!=null){
            temp.data=list.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Node head = new Node(5);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);

        System.out.println("Original List:");
        printList(head);

        Node newHead = sorting(head);

        System.out.println(" Sorted List :");
        printList(newHead);
    }
    
}
