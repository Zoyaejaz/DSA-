package Binary_Tree;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class max_path_sum {
    int maxsum=Integer.MIN_VALUE;
    public int maxpathsum(Node root){
        pathsum(root);
        return maxsum;
    }
    public int pathsum(Node root){
        if (root==null) return 0;
        int left=Math.max(0,pathsum(root.left));
        int right=Math.max(0,pathsum(root.right));
        maxsum=Math.max(maxsum,left+right+root.data);
        return Math.max(0,Math.max(left,right)+root.data);
    }
    public static void main(String[] args){
        Node root=new Node(-10);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        max_path_sum obj=new max_path_sum();
        System.out.println(obj.maxpathsum(root));

    }
}
