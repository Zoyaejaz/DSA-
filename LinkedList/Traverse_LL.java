class Node{
    int data;
    Node next;
    Node(int data1,Node next){
        this.data= data1;
        this.next= next;
    }
    Node(int data1){
        this.data= data1;
        this.next= null;
    }
}
public class Traverse_LL {
    private static Node converting(int[] arr){
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;

    }
    public static void main(String[] args) {
        int[] arr={4,8,5,9,6};
        Node head = converting(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    
}
