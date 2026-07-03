package Double_linked_list.Insertion;

import Double_linked_list.Deletion.head;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
}
public class before_head {
    private static Node convert(int[] arr){
    Node head=new Node(arr[0]);
    Node prev=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i],null,prev);
        prev.next=temp;
        prev=temp;
    }
    return head;
   } 
   private static void print(Node head){
    while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
    }
   }
   private static Node Insert_beforehead(Node head,int value){
    Node newhead=new Node(value,head,null);
    head.prev=newhead;
    return newhead;
   }
public static void main(String[] args) {
    int[] arr={2,4,6,1,7};
    Node head=convert(arr);
    head=Insert_beforehead(head, 5);
    print(head);
}
}
