class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)    return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length; i++){
            set.add(nums[i]);
        }
        int max = 1;
        int count = 1;
        for(int num : set){
            if(!set.contains(num - 1)){
                int curr = num;
                count = 1;
                while(set.contains(curr + 1)){
                    count++;
                    curr ++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}