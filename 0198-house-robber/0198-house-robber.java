class Solution {
    public int solve(int idx,int[] nums,int[] memo){
        if(idx==0)  return memo[idx] = nums[idx];
        if(idx<0)   return 0;
        if(memo[idx]!=-1)   return memo[idx];
        int take = nums[idx] + solve(idx-2,nums,memo);
        int notTake = 0 + solve(idx-1,nums,memo);
        return memo[idx] = Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo,-1);
        return solve(n-1,nums,memo);
    }
}