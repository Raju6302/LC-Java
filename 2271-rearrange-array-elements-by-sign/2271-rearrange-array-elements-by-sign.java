class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positives.add(nums[i]);
            } else {
                negatives.add(nums[i]);
            }
        }

        int[] result = new int[nums.length];
        int positive=0, negative=0;
        for (int i =0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = positives.get(positive++);
            } else {
                result[i] = negatives.get(negative++);
            }
        }
        return result;
    }
}