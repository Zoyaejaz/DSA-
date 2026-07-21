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
public class kth_el {
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
    private static Node insertNode(Node head,int el,int k){
        if(head==null){
            if(k==1){
                return new Node(el);
            }
            else{
                return head;
            }
        }
        if(k==1){
            return new Node(el,head);
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==(k-1)){
                Node x=new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6};
        Node head=convert_arr_Node(arr);
        head=insertNode(head, 100, 2);
        print(head);
    }
}
