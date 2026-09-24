class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a=0;
            while(nums[i]!=0){
                int k=nums[i]%10;
                a+=k;
                nums[i]=nums[i]/10;
            }
            if(a==i)    return i;
        }
        return -1;
    }
}