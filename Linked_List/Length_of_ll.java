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
public class Length_of_ll {
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
    private static int lengthofll(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2,5,3,7,8};
        Node head=convert_arr_Node(arr);
        System.out.println(lengthofll(head));
    }
}
