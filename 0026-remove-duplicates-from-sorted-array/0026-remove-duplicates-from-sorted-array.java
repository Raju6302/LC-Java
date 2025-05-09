class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int maxIndex = 1;
        for (int i = 1; i < nums.length; i++) {
              if (nums[i] != nums[maxIndex - 1]){
                 nums[maxIndex] = nums[i];
                 maxIndex++;
              }   
        }

        return maxIndex;
      
    }
}