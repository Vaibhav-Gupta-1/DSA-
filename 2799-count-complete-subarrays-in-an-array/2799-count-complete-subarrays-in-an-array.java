class Solution {
        public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums)
            set.add(a);
        int n = nums.length, k = set.size(), ans = 0, i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            if (map.getOrDefault(nums[j], 0) == 0)
                k--;
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (k == 0) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0)
                    k++;
                i++;
            }
            ans += i;
        }
        return ans;
    }
}