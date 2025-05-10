class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] == nums[i]) {
                    isUnique = false;
                    break;
                } 
            }
            if (isUnique) return nums[i];
        }
        return -1;
    }
}