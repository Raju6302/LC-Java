class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 1;
        int mn = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (mn + k < nums[i]) {
                res++;
                mn = nums[i];
            }
        }
        return res;
    }
}