package Binary_Tree;
import java.util.*;
public class max_width {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static class Pair{
        Node node;
        long index;
        Pair(Node node,long index){
            this.node=node;
            this.index=index;
        }
    }

    public static int width(Node root){
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int maxwidth=0;
        while(!q.isEmpty()){
            int size=q.size();
            long first=q.peek().index;
            long last =first;
            for(int i=0;i<size;i++){
                Pair current=q.poll();
                Node node=current.node;
                long index=current.index;
                last=index;
                if(node.left!=null) q.add(new Pair(node.left,2*index+1));
                if(node.right!=null) q.add(new Pair(node.right,2*index+2));
            }
            long width=last-first+1;
            maxwidth=Math.max((int)width,maxwidth);
        }
        return maxwidth;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(7);
        root.left.left=new Node(8);
        root.right.right=new Node(4);
        int ans=width(root);
        System.out.println(ans);
    }
}
