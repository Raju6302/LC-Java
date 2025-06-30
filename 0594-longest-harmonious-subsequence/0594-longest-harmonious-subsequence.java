class Solution {
    public int findLHS(int[] nums) {
        int res = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (final int num : nums) {
            count.merge(num, 1, Integer::sum);
        }

        for (final int num : count.keySet()) {
            if (count.containsKey(num + 1)) {
                res = Math.max(res, count.get(num) +  count.get(num + 1));
            }
        }

        return res;
    }
}