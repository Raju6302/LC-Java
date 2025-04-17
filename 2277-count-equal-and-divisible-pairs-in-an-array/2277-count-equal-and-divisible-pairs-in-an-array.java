class Solution {
    public int countPairs(int[] nums, int k) {
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                ans += nums[j] == nums[i] && (j * i % k) == 0 ? 1 : 0;
            }
        }

        return ans;
    }
}