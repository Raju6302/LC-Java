class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int count = set.size();
        int result = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            set.clear();
            for (int j = i; j < n; j++) {
                set.add(nums[j]);
                if (set.size() == count) {
                    result++;
                }
            }
        }
        return result;
    }
}