package Double_linked_list;
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
public class Intro {
    public static void main(String[] args){
        int[]arr={2,4,1,5,3};
        Node head=new Node(arr[0]);
        System.out.println(head.data);
    }
}
