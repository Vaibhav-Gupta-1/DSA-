class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            rotate(mat);
            if(isEqual(mat,target)) return true;
        }
        return false;
    }
    private void rotate(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = mat[i][start];
            mat[i][start] = mat[i][end];
            mat[i][end] = temp;
            start++;
            end--;
            }
        }
    }
    private boolean isEqual(int[][] mat, int[][] target){
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] != target[i][j])   return false;
            }
        }
        return true;
    }
}