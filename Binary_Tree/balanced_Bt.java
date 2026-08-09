package Binary_Tree;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class balanced_Bt {
    public boolean isBalanced(Node root) {
        return (check(root)!=-1);
    }
    public int check(Node root){
        if(root==null) return 0;
        int hl=check(root.left);
        if(hl==-1){
            return -1;
        }
        int hr=check(root.right);
        if(hr==-1){
            return -1;
        }
        if(Math.abs(hl-hr)>1){
            return -1;
        }
        return 1+Math.max(hl,hr);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        balanced_Bt obj=new balanced_Bt();
        System.out.println(obj.isBalanced(root));
    }
}
