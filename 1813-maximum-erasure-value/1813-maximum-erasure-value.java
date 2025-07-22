class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxSub = 0, currentSum = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while(set.contains(nums[j])) {
                set.remove(nums[i]);
                currentSum -= nums[i];
                i++;
            }
            set.add(nums[j]);
            currentSum += nums[j];
            maxSub = Math.max(currentSum, maxSub);
        }
        
        return maxSub;
    }
}