class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }

            if (i < n) {
                nge[i] = stack.empty() ? -1 : stack.peek(); 
            }

            stack.push(nums[i % n]);
        }

        return nge;
    }
}