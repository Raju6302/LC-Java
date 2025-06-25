class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long low = -1_000_000_000_0L;
        long high = 1_000_000_000_0L; 
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = countProductsLessThanOrEqualTo(nums1, nums2, mid);

            if (count >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

   
     long countProductsLessThanOrEqualTo(int[] nums1, int[] nums2, long val) {
        long count = 0;
        int n2 = nums2.length;

        for (int x : nums1) {
            if (x == 0) {
                if (val >= 0) {
                    count += n2; 
                }
            } else if (x > 0) {
                int low = 0, high = n2 - 1, rightmostIdx = -1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if ((long) x * nums2[mid] <= val) {
                        rightmostIdx = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                count += (rightmostIdx + 1);
            } else { 
    
                int low = 0, high = n2 - 1, leftmostIdx = n2;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if ((long) x * nums2[mid] <= val) {
                        leftmostIdx = mid;
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                count += (n2 - leftmostIdx); 
            }
        }
        return count;
    }
}