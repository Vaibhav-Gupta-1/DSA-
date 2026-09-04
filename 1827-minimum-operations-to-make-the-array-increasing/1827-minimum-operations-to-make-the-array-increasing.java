class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1])
            {
                int t = nums[i];
                nums[i] = nums[i-1]+1;
                int d = nums[i]-t;
                ans+=d;
            }
        }
    return ans;
    }
}