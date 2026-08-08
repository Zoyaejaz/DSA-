package Binary_Tree;
import java.util.*;
class Node{
    int  data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BFS_Levelorder {
    public List<List<Integer>> level(Node root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                level.add(current.data);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        BFS_Levelorder bfs_levelorder=new BFS_Levelorder();
        List<List<Integer>> result=bfs_levelorder.level(root);
        System.out.println("Level Order Traversal: ");
        for(List<Integer> level:result){
            System.out.println(level);
        }
    }
}
