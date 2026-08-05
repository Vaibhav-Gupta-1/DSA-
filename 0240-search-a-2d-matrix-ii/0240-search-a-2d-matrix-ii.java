class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int i=0,j=arr[0].length-1;
        while(i<arr.length && j>=0){
            int val = arr[i][j];
            if(val==target)
            return true;
            else if(val<target)
            i=i+1;
            else
            j=j-1;
        }
        return false;
    }
}