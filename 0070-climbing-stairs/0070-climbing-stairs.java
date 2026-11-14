class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        ways(n,memo);
        return memo[n];
    }
    public int ways(int n,int[] memo){
        if(n==1)    return memo[n] = 1;
        if(n==2)    return memo[n] = 2;
        if(memo[n]!=-1) return memo[n];
        return memo[n] = ways(n-1,memo) + ways(n-2,memo);
    }
}