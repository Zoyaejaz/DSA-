package Binary_Tree;
class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
public class Same_Tree {
    //T.C=O(n) and S.C=O(n)
    public static boolean isSame(Node p, Node q){
        if(p==null ||q==null){
            return p==q;
        }
        return (p.data==q.data) && isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    public static void main(String[] args){
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);
        root1.left.right=new Node(5);

        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(3);
        root2.left.left=new Node(4);
        root2.left.right=new Node(5);

        System.out.println(isSame(root1,root2));
    }
}
