class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = findMax(nums);

        int low = 0, high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = smallestDivisor(mid, nums);
            if (result <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
               low = mid + 1;
            }
        }
       
        return ans;
    }

    int findMax(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], sum);
        }
        return sum;
    }

    int smallestDivisor(int i, int[] nums) {
        int sum = 0;
        for (int d = 0; d < nums.length; d++) {
            sum += Math.ceil((double) nums[d] / (double) i);
        }

        return sum;
    }
}