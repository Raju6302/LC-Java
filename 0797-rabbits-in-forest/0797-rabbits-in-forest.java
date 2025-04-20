class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<>();
        for ( int i : answers) {
            count.merge(i, 1, Integer::sum);
        }
        int res = 0;
        for (var e : count.entrySet()) {
            int group = e.getKey() + 1;
            res += (e.getValue() + group - 1) / group * group;
        }
        return res;
    }
}