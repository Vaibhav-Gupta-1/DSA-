class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        int j=0,k=0;
        int[] ans = new int[nums.length];
        for(int i=2;i<nums.length;i++)
        {
            if(a1.get(j)>a2.get(k)){
                a1.add(nums[i]);
                j++;
            }
            else
            {
                a2.add(nums[i]);
                k++;
            }
        }
        int c = 0;
        for(int num : a1){
            ans[c++] = num;
        }
        for(int num : a2){
            ans[c++] = num;
        }
        return ans;
    }
}