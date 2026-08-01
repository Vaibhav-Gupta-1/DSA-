class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int n : nums){
        map.put(n, map.getOrDefault(n, 0) + 1);        
        }
        for(int i : map.keySet()){
            if(map.get(i)>nums.length/3)
            ans.add(i);
        }
        return ans;
    }
}