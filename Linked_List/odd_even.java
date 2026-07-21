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
public class odd_even{
     private static Node convert_arr_Node(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static Node oddeven(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenhead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }

    private static void printList(Node head){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data);
            if(cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={2,5,3,7,8};
        Node head=convert_arr_Node(arr);
        Node head1=oddeven(head);
        printList(head1);
    }
}