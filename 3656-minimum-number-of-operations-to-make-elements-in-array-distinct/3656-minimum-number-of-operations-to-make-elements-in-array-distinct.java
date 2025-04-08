class Solution {
    public int minimumOperations(int[] nums) {
         int n = nums.length;
        
        for (int i = 0; i <= n; i += 3) {
            Set<Integer> seen = new HashSet<>();
            boolean isDistinct = true;
            for (int j = i; j < n; j++) {
                if (!seen.add(nums[j])) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                return i / 3;
            }
        }
        
        return (n + 2) / 3;
    }
}