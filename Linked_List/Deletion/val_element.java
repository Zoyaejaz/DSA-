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
public class val_element {
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
    private static Node remove(Node head,int el){
        if(head==null) return head;
        if(head.data==el){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==el){
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
        head=remove(head, 4);
        print(head);
    }
}
