package Linked_List;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}
public class reverse {
    //T.C=O(2n), S.C=O(n)
    public static Node reverse(Node head){
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
    }
    //Optimized approach, T.C=O(n), S.C=O(1)
    public static Node reverse_second_approach(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
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
        int[] arr={1,2,3,4,5,6};
        Node head=buildlist(arr);
        Node head1=reverse(head);
        printlist(head1);
    }
    
}
