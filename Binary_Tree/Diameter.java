package Binary_Tree;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class Diameter {
    static int diameter=0;
    public static int find_diameter(Node root){
        height(root);
        return diameter;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        diameter=Math.max(diameter, left + right);
        return 1+Math.max(left,right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println(find_diameter(root));
    }
}