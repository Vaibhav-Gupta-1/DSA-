class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            map.add(num);
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }
        List<Integer> ans = new ArrayList<>();
        for (int x = mn; x <= mx; x++) {
            if (!map.contains(x)) {
                ans.add(x);
            }
        }
        return ans;
    }
}