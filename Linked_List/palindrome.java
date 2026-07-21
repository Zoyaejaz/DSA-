package Linked_List;

import java.util.*;
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class palindrome {
    public static boolean isPalindrome(Node head) {
       Node temp=head;
       Stack<Integer> st=new Stack<>();
       while(temp!=null){
        st.push(temp.data);
        temp=temp.next;
       }
       temp=head;
       while(temp!=null){
        if(temp.data!=st.peek()) return false;
        temp=temp.next;
        st.pop();
       }
       return true;
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
    public static void main(String[] args){
        int[] arr={1,2,4,3,2,2,1};
        Node head=buildlist(arr);
        boolean head1=isPalindrome(head);
        System.out.println(head1);
    }
}
