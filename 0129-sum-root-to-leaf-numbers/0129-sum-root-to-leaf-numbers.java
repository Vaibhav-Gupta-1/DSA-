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
class Solution {
    int sum = 0;
    public void dfs(TreeNode root,int cn){
        if(root == null)    return;
        cn = cn*10+root.val;
        if(root.left==null && root.right == null)
        sum+=cn;
        dfs(root.left,cn);
        dfs(root.right,cn);
    }
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return sum;
    }
}