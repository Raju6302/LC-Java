class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high  = mid - 1;
            }
        }
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i] == target) {
        //         return true;
        //     }
        // }
        return false;
    }
}