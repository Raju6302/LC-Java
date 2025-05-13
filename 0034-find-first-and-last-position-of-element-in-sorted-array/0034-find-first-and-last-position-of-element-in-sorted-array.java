class Solution {
    public int[] searchRange(int[] nums, int target) {
      int n = nums.length - 1;
      int low = 0, high = n; 
      int first = indexOccurence(nums, target, low, high, true);
      if (first == -1) return new int[] {-1, -1};
      int second = indexOccurence(nums, target, low, high, false);
      return new int[] {first, second}; 
    
    }

    public int indexOccurence(int[] nums, int target, int low, int high, boolean firstIndex) {
        int ans = -1;
        while (low <= high) {
        int mid = low + high - low / 2;
        
        if (nums[mid] == target) {
            ans = mid;
            if (firstIndex) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } else if (nums[mid] < target) {
            low = mid+1;
        } else {
            high = mid - 1;
        }
      }
      return ans;
    }

    
}