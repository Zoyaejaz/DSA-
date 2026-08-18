package Binary_Tree;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class Lowestcommon_ancestor {
    public static Node ancestor(Node root,Node p,Node q){
        if(root==null) return null;
        if(root==p||root==q) return root;
        Node left=ancestor(root.left,p,q);
        Node right=ancestor(root.right,p,q);
        if(left!=null && right!=null) return root;
        if(left!=null) return left;
        return right;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.left.right.right=new Node(7);
        root.right.left=new Node(8);
        root.right.right=new Node(9);
        Node p=root.left.right;
        Node q=root.right.right;
        Node ans=ancestor(root,p,q);
        System.out.println(ans.data);
    }
}
