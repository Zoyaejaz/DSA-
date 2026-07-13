package Linked_List;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class remove_nth {
    public static Node remove(Node head,int n){
        Node dummy=new Node(0);
        dummy.next=head;
        Node fast=dummy;
        Node slow=dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
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
    public static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next != null) System.out.print(" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=buildlist(arr);
        Node head1=remove(head,2);
        printlist(head1);

    }
    
}
