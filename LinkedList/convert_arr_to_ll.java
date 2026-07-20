package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data1, Node next){
        this.data = data1;
        this.next = next;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
} 
public class convert_arr_to_ll {
    private static Node convert(int[] arr){
        if(arr.length==0){
            return null;
        }
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
        int[] arr={2,3,4,5};
        Node head=convert(arr);
        System.out.println(head.data);
       
    }
}
