class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ans =  dfs(grid, i, j, m, n);
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        grid[i][j] = -1;
        return dfs(grid, i+1, j, m, n)+dfs(grid, i-1, j, m, n)+dfs(grid, i, j+1, m, n)+dfs(grid, i, j-1, m, n);
    }
}