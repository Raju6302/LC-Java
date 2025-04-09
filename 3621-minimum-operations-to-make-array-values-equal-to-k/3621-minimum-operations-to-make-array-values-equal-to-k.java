class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] seen = new boolean[101];
        int count = 0;

        for (int num : nums) {
            if (num < k) return -1;
            if (num > k && !seen[num]) {
                seen[num] = true;
                count++;
            }
        }

        return count;
    }
}