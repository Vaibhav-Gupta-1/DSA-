import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;
        int fr = 0, lr = matrix.length - 1;
        int fc = 0, lc = matrix[0].length - 1;
        while (fr <= lr && fc <= lc) {
            for (int j = fc; j <= lc; j++) {
                ans.add(matrix[fr][j]);
            }
            fr++;
            for (int i = fr; i <= lr; i++) {
                ans.add(matrix[i][lc]);
            }
            lc--;
            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    ans.add(matrix[lr][j]);
                }
                lr--;
            }
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(matrix[i][fc]);
                }
                fc++;
            }
        }
        return ans;
    }
}