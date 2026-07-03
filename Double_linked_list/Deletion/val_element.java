package Double_linked_list.Deletion;
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
public class val_element {
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
   private static Node delete_head(Node head){
    if(head==null || head.next==null ){
        return null;
    }
    Node prev=head;
    head=head.next;
    head.prev=null;
    prev.next=null;
    return head;
   }
   private static Node remove_tail(Node head){
    if(head==null || head.next==null){
        return null;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node newtail=temp.prev;
    temp.prev=null;
    newtail.next=null;
    return head;
   }
   private static void remove_Node(Node temp){
   Node back=temp.prev;
   Node front=temp.next;
   if(front==null){
    back.next=null;
    temp.prev=null;
    return;
   }
   back.next=front;
   front.prev=back;
   temp.next=temp.prev=null;
   }
   public static void main(String[] args) {
    int[] arr={1,4,2,6,8,4};
    Node head=convert(arr);
    remove_Node(head.next);
    print(head);
   }
}
