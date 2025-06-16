class Solution {
    public int maximumDifference(int[] nums) {
        int min = 1 << 30;
        int res = -1;

        for (int x : nums) {
            if (x > min) {
                res = Math.max(res, x - min);
            } else {
                min = x;
            }
        }

        return res;
    }
}