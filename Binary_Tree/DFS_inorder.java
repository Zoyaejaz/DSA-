package Binary_Tree;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class DFS_inorder {
    public static void in(Node root){
        if(root==null){
            return;
        }
        in(root.left);
        System.out.print(root.data+" ");
        in(root.right);
    }
    public static void main(String[] args){
        Node root=new Node(0);
        root.left=new Node(1);
        root.right=new Node(2); 
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        in(root);
    }
}
