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
public class head {
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
   public static void main(String[] args) {
    int[] arr={2,1,5,7,9};
    Node head=convert(arr);
    head=delete_head(head);
    print(head);
   }
}
