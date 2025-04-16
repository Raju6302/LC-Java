class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        long res = 0, cur = 0;
        int i = 0;
        for (int x : nums) {
            cur += count.merge(x, 1, Integer::sum) - 1;
            while (cur - count.get(nums[i]) + 1 >= k) {
                cur -= count.merge(nums[i++], -1, Integer::sum);
            }
            if (cur >= k) {
                res += i + 1;
            }
        }
        return res;
    }
}