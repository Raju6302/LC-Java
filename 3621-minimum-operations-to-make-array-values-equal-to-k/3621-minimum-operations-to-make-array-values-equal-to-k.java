class Solution {
    public int minOperations(int[] nums, int k) {
        for (int num : nums) {
            if (num < k) return -1;
        }

        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (num > k) unique.add(num);
        }

        int operations = 0;
        while (!unique.isEmpty()) {
            int max = Collections.max(unique);
            unique.remove(max);
            operations++;
        }

        return operations;
    }
}