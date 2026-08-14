package Binary_Tree;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class Boundary_traversal {
    public ArrayList<Integer> boundaryTraversal(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        if(!isleaf(root)) ans.add(root.data);
        leftboundary(root.left,ans);
        leafnodes(root.left,ans);
        leafnodes(root.right,ans);
        rightboundary(root.right,ans);
        return ans;
    }
    public boolean isleaf(Node root){
        return root.left==null && root.right==null;
    }
    public void leftboundary(Node root,ArrayList<Integer> ans){
        while(root!=null){
            if(!isleaf(root)) ans.add(root.data);
            if(root.left!=null) root=root.left;
            else root=root.right;
        }
    }
    public void rightboundary(Node root,ArrayList<Integer> ans){
        ArrayList<Integer> temp=new ArrayList<>();
        while(root!=null){
            if(!isleaf(root)) temp.add(root.data);
            if(root.right!=null) root=root.right;
            else root=root.left;
        }
        for(int i=temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    public void leafnodes(Node root,ArrayList<Integer> ans){
        if(isleaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left!=null) leafnodes(root.left,ans);
        if(root.right!=null) leafnodes(root.right,ans);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.left.right=new Node(4);
        root.left.left.right.left=new Node(5);
        root.left.left.right.right=new Node(6);
        root.right=new Node(7);
        root.right.right=new Node(8);
        root.right.right.left=new Node(9);
        root.right.right.left.left=new Node(10);
        root.right.right.left.right=new Node(11);
        Boundary_traversal obj=new Boundary_traversal();
        System.out.println(obj.boundaryTraversal(root));
    }
}
