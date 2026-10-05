class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>(n);
        for(int k = 0;k<n;k++){
            adjL.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i!=j && isConnected[i][j] == 1){
                    adjL.get(i).add(j);
                }
            }
        }
        int[] vis = new int[n];
        int province = 0;
        for(int i = 0 ;i<n;i++){
            if(vis[i] == 0){
                province++;
                dfs(i,adjL,vis);
            }
        }
        return province;
    }
    public void dfs(int curr, ArrayList<ArrayList<Integer>> adjL, int[] vis){
        vis[curr] = 1;
        for(int neighbour : adjL.get(curr)){
            if(vis[neighbour] == 0){
                dfs(neighbour,adjL,vis);
            }
        }
    }
}