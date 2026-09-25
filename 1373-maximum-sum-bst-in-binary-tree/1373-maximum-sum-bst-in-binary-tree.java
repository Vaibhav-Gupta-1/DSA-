class Triplet {
    int min;
    int max;
    int cs;

    Triplet(int min, int max, int cs) {
        this.min = min;
        this.max = max;
        this.cs = cs;
    }
}

class Solution {
    private int maxSum = 0;
    public Triplet dfs(TreeNode root) {
        if (root == null) {
            return new Triplet(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        Triplet lst = dfs(root.left);
        Triplet rst = dfs(root.right);
        if (root.val > lst.max && root.val < rst.min) {
            int currentSum = root.val + lst.cs + rst.cs;
            maxSum = Math.max(maxSum, currentSum);
            int minVal = Math.min(root.val, lst.min);
            int maxVal = Math.max(root.val, rst.max);
            return new Triplet(minVal, maxVal, currentSum);
        }
        return new Triplet(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
    }
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        dfs(root);
        return maxSum;
    }
}