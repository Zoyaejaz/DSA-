package Binary_Tree;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}

public class vertical_traversal {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        // Store: {column, row, value}
        List<int[]> nodes = new ArrayList<>();

        dfs(root, 0, 0, nodes);

        // Sort by:
        // 1. column
        // 2. row
        // 3. value
        Collections.sort(nodes, (a, b) -> {

            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }

            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }

            return Integer.compare(a[2], b[2]);
        });

        int prevColumn = Integer.MIN_VALUE;

        for (int[] node : nodes) {

            int column = node[0];
            int value = node[2];

            // New column
            if (column != prevColumn) {
                ans.add(new ArrayList<>());
                prevColumn = column;
            }

            // Add value to current column
            ans.get(ans.size() - 1).add(value);
        }

        return ans;
    }

    private void dfs(TreeNode root, int row, int column,
                     List<int[]> nodes) {

        if (root == null) {
            return;
        }

        // Store {column, row, value}
        nodes.add(new int[]{column, row, root.data});

        // Left child
        dfs(root.left, row + 1, column - 1, nodes);

        // Right child
        dfs(root.right, row + 1, column + 1, nodes);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        vertical_traversal vt = new vertical_traversal();

        List<List<Integer>> result = vt.verticalTraversal(root);

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}