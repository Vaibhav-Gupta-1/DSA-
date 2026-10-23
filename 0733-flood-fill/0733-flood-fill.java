class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor == color)  return image;
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int originalColor, int color){
        int n = image.length;
        int m = image[0].length;
        if(sr<0 || sr>=n || sc<0 || sc>=m)  return;
        if(image[sr][sc] != originalColor)  return;
        image[sr][sc] = color;
        dfs(image,sr+1,sc,originalColor,color);
        dfs(image,sr-1,sc,originalColor,color);
        dfs(image,sr,sc+1,originalColor,color);
        dfs(image,sr,sc-1,originalColor,color);
    }
}