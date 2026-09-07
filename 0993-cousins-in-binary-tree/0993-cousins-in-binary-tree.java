class Solution {
    private int depthX = -1;
    private int depthY = -1;
    private TreeNode parentX = null;
    private TreeNode parentY = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, 0, x, y);
        return depthX == depthY && parentX != parentY;
    }
    private void dfs(TreeNode root, TreeNode parent, int depth, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.val == x) {
            depthX = depth;
            parentX = parent;
        } else if (root.val == y) {
            depthY = depth;
            parentY = parent;
        }
        dfs(root.left, root, depth + 1, x, y);
        dfs(root.right, root, depth + 1, x, y);
    }
}