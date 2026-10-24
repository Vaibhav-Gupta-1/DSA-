class Pair{
    int sr;
    int sc;
    Pair(int sr, int sc){
        this.sr = sr;
        this.sc = sc;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int oldColor = image[sr][sc];
        if(oldColor == color)   return image;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(sr,sc));
        image[sr][sc] = color;
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,-1,1};
        while(!q.isEmpty()){
            Pair it = q.peek();
            int i = it.sr;
            int j = it.sc;
            q.poll();
            for(int k=0; k<4; k++){
                int a = i+dx[k];
                int b = j+dy[k];
                if (a>=0 && a<m && b>=0 && b<n && image[a][b] == oldColor){
                    image[a][b] = color;
                    q.offer(new Pair(a, b));
                }
            }
        }
        return image;
    }
}