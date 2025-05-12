class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] result = new int[nums.length];
        int positives=0, negatives=1;
        for (int i =0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                result[negatives] = nums[i];
                negatives += 2;
            } else {
                result[positives] = nums[i];
                positives += 2;
            }
        }
        return result;
    }
}