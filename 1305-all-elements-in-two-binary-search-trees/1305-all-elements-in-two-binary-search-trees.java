import java.util.ArrayList;
import java.util.List;

class Solution {
    public void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        inOrder(root1, l1);
        inOrder(root2, l2);

        int i = 0, j = 0;
        int n1 = l1.size(), n2 = l2.size();
        while (i < n1 && j < n2) {
            if (l1.get(i) <= l2.get(j)) {
                ans.add(l1.get(i));
                i++;
            } else {
                ans.add(l2.get(j));
                j++;
            }
        }
        while (i < n1) {
            ans.add(l1.get(i));
            i++;
        }
        while (j < n2) {
            ans.add(l2.get(j));
            j++;
        }

        return ans;
    }
}