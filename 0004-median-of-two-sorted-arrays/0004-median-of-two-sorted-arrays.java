class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n = nums1.length;
     int m = nums2.length;
     int[] combinedArray = new int[n + m];
     int i = 0, j = 0, index = 0;
     while (i < n && j < m) {
        if (nums1[i] < nums2[j]) {
            combinedArray[index++] = nums1[i++];
        } else {
            combinedArray[index++] = nums2[j++];
        }
     }

     while (i < n) {
        combinedArray[index++] = nums1[i++];
     }

      while (j < m) {
        combinedArray[index++] = nums2[j++];
     }

     
    int cLength = combinedArray.length;

    if (cLength % 2 == 1) {
    return (double)combinedArray[cLength / 2];
    } 
    
    return (double) ((combinedArray[cLength / 2]) + (combinedArray[cLength / 2 - 1]))/ 2;

    }
}