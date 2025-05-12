class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer, Integer> hash = new HashMap<>();
       int[] ans = new int[2];
       ans[0] = ans[1] = -1;
       for(int i = 0; i < nums.length; i++) {
        int num1 = nums[i];
        int moreNeeded = target - num1;
        if (hash.containsKey(moreNeeded)) {
            ans[0] = hash.get(moreNeeded);
            ans[1] = i;
            return ans;
        }

        hash.put(nums[i], i);
       }
       return ans;
    }
}
