class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for(int i=0;i<n;i++){
            sq[i] = (long)nums[i]*nums[i];
        }
        Arrays.sort(sq);
        long ans = 0l;
        for(int i=0; i<n/2; i++){
            ans -= sq[i];
        }
        for(int i=n/2; i<n; i++){
            ans += sq[i];
        }
        return ans;
    }
}