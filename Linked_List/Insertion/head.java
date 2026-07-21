package Linked_List.Insertion;
class Node{
    int data;
    Node next;
    Node(int data1,Node next){
        this.data=data1;
        this.next=next;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class head {
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
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    private static Node add(Node head,int val){
        Node temp=new Node(val,head);
        return temp;
    }
    public static void main(String[] args) {
        int[] arr={2,5,7,3,9};
        Node head=convert_arr_Node(arr);
        head=add(head,8);
        print(head);
    }
}
