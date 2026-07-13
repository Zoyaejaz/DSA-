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
public class sort_0_1 {
    //T.C=O(n),S.C=O(1)
    public static Node sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node zerohead=new Node(-1);
        Node zero=zerohead;
        Node onehead=new Node(-1);
        Node one=onehead;
        Node twohead=new Node(2); 
        Node two=twohead;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            } 
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }

        zero.next = (onehead.next != null) ? onehead.next : twohead.next;
        one.next = twohead.next;
        two.next = null;

        Node newhead = (zerohead.next != null) ? zerohead.next : ((onehead.next != null) ? onehead.next : twohead.next);
        return newhead;
    }
    private static Node buildList(int[] values){
        if(values == null || values.length == 0) return null;
        Node head = new Node(values[0]);
        Node tail = head;
        for(int i = 1; i < values.length; i++){
            tail.next = new Node(values[i]);
            tail = tail.next;
        }
        return head;
    }

    private static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1,0,1,2,0,2,1};
        Node head = buildList(arr);
        Node sorted = sort(head);
        printList(sorted);
    }
}
