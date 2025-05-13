class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1 || nums[0] > nums[1]) return 0;
        int n = nums.length - 1;
        if (nums[n] > nums[n-1]) return n;
        int low = 1, high = n-1;
        while (low <= high) {
            int mid = low + (high - low ) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}