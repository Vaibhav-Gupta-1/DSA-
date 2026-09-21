/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.ArrayList;

class Solution {
    private int index = 0;
    public TreeNode convertBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        for (int i = list.size() - 2; i >= 0; i--) {
            list.set(i, list.get(i) + list.get(i + 1));
        }
        index = 0;
        updateNodes(root, list);
        return root;
    }
    public void inOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    private void updateNodes(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        updateNodes(root.left, list);
        root.val = list.get(index++);
        updateNodes(root.right, list);
    }
}