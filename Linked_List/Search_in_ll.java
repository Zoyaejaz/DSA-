package Linked_List;
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
    public class Search_in_ll {
    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static int search(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val) return 1;
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,3,7};
        Node head=convert(arr);
        System.out.println(search(head, 5));
    }
}
