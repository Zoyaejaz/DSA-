package Deletion;
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
public class kth_element {
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
    private static Node remove(Node head,int k){
        if(head==null) return head;
        if(k==1){
            head=head.next;
            return head;
        }
        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,6,4,8};
        Node head=convert_arr_Node(arr);
        head=remove(head, 1);
        print(head);
    }
}
