class Solution {
    public int[] searchRange(int[] nums, int target) {
      int n = nums.length - 1;
      int low = 0, high = n; 
      int first = firstOccurence(nums, target, low, high);
      int second = secondOccurence(nums, target, low, high);
      
      if (first != -1) return new int[] {first, second};

      return new int[] {-1, -1}; 
    
    }

    public int firstOccurence(int[] nums, int target, int low, int high) {
        int first = -1;
        while (low <= high) {
        int mid = low + high - low / 2;
        if (nums[mid] == target) {
            first = mid;
            high = mid - 1;
        } else if (nums[mid] < target) {
            low = mid+1;
        } else {
            high = mid - 1;
        }
      }
      return first;
    }

    public int secondOccurence(int[] nums, int target, int low, int high) {
        int second = -1;
        while (low <= high) {
        int mid = low + high - low / 2;
        if (nums[mid] == target) {
            second = mid;
            low = mid + 1;
        } else if (nums[mid] < target) {
            low = mid+1;
        } else {
            high = mid - 1;
        }
      }
      return second;
    }
}