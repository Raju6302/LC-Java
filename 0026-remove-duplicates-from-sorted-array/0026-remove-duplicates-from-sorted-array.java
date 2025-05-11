class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[res]) {
                nums[res + 1] = nums[i];
                res++;
            }
        }
       
      return res + 1;
    }
}