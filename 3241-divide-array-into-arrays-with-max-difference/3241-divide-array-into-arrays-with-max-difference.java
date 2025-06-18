class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int[][] res = new int[n/3][];

        for (int i = 0; i < n; i += 3) {
            int[] subArray = Arrays.copyOfRange(nums, i , i + 3);

            if (subArray[2] - subArray[0] > k) {
                return new int[][] {};
            }

            res[i/3] = subArray;
        }

        return res;
    }
}