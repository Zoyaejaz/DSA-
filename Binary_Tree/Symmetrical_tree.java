package Binary_Tree;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class Symmetrical_tree {
    public static boolean issymetric(Node left, Node right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.data!=right.data) return false;
        return issymetric(left.left,right.right) && issymetric(left.right,right.left);
    }
    public static boolean issymmetric(Node root){
        if(root==null) return true;
        return issymetric(root.left,root.right);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(4);
        root.right.right=new Node(3);
        System.out.println(issymmetric(root));
    }
}
