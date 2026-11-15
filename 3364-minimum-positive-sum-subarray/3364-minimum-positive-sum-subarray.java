class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        for (int len = l; len <= r; len++) {
            for (int i = 0; i + len <= n; i++) {
                int sum = 0;
                for (int k = i; k < i + len; k++)
                    sum += nums.get(k);
                if (sum > 0 && sum < ans) ans = sum;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}