package Binary_Tree;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Zigzag{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> list = new ArrayList<>();
    if(root==null) return new ArrayList<>();
    queue.offer(root);
    boolean turn = false;
    while(!queue.isEmpty()){
        List<Integer> ans = new ArrayList<>();
        int s = queue.size();
        for(int i =0; i < s; i++) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);   
            }
            if(turn) Collections.reverse(ans);
            turn = !turn;       
            list.add(new ArrayList<>(ans));
            }
            return list;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        Zigzag obj=new Zigzag();
        System.out.println(obj.zigzagLevelOrder(root));
    }
}