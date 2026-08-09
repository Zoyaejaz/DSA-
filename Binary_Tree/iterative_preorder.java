package Binary_Tree;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class iterative_preorder {
    public static int maxd(Node root){
        if(root==null){
            return 0;
        }
        int lh=maxd(root.left);
        int rh=maxd(root.right);
        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        System.out.println(maxd(root));
    }
}
