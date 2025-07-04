class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(Math.abs(i - j) <= k && nums[j] == key) {
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}