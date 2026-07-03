package Double_linked_list.Insertion;
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
public class before_givennode {
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
   private static Node Insert_beforetail(Node head,int val){
    if(head.next==null){
        return Insert_beforehead(head, val);
    }
    Node tail=head;
    while(tail.next!=null){
        tail=tail.next;
    }
    Node back=tail.prev;
    Node newNode=new Node(val,tail,back);
    back.next=newNode;
    tail.prev=newNode;
    return head;
   }
   private static Node Insert_beforekth(Node head,int k,int val){
    if(k==1){
        return Insert_beforehead(head, val);
    }
    Node temp=head;
    int cnt=0;
    while(temp!=null){
        cnt++;
        if(cnt==k) break;
        temp=temp.next;
    }
    Node back=temp.prev;
    Node newNode=new Node(val,temp,back);
    back.next=newNode;
    temp.prev=newNode;
    return head;
   }
   private static  void Insert_kthnode(Node node,int val){
    Node back=node.prev;
    Node newNode=new Node(val,node,back);
    back.next=newNode;
    node.prev=newNode;
   }
   public static void main(String[] args) {
    int[] arr={2,4,6,8,9};
    Node head=convert(arr);
    Insert_kthnode(head.next.next,4);
    print(head);
   }
}
