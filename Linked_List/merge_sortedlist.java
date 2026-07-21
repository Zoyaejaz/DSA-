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
public class merge_sortedlist {
    public static Node merge(Node list1,Node list2){
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        Node tail=list1;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=list2;
        ArrayList<Integer> arr=new ArrayList<>();
        Node temp=list1;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(arr);
        temp=list1;
        int i=0;
        while(temp!=null){
            temp.data=arr.get(i);
            i++;
            temp=temp.next;
        }
        return list1;
    }
    public static Node convert(int[] arr){
        if(arr.length==0){
            return null;
        }
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
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
        int[] arr1={2,4,6,7,1};
        int[] arr2={8,4,7,2,0};
        Node list1=convert(arr1);
        Node list2=convert(arr2);
        Node head=merge(list1,list2);
        printList(head);
    }
}
