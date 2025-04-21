class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long num = 0, min = 0, max = 0;
        for (int d : differences) {
            num += d;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return Math.max(0, (int) (upper - lower - (max - min) + 1));
    }
}