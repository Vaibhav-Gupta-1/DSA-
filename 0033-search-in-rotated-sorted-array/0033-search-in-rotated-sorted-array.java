class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                // if(i==0)
                // return nums.length-1;
                // else
                return i;
            }
        }
        return -1;
    }
}