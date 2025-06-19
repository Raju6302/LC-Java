class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_water = 0;

        while (left <  right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int calculate_area = width * minHeight;

            max_water = Math.max(max_water, calculate_area);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return max_water;
    }
}