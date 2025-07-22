class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val =  (long)(m * k);
        if (val > n) return -1;
        int min = findMin(bloomDay);
        int max = findMax(bloomDay);

        int low = min, high = max, ans = -1;
         while (low <= high) {
           // for (int i = min; i <= max; i++) {
            int mid = low + (high - low) / 2;
            int result = findBloomDay(mid, bloomDay, m, k);
            // if (result >= m) return i;
            if (result >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    int findBloomDay(int day, int[] nums, int m, int k) {
        int count = 0; 
        int bouquet = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= day) {
                count++;
            } else {
                bouquet += (count / k) ;
                count = 0;
            }
        }
        bouquet += (count / k);
        return bouquet;
    }

    int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

}