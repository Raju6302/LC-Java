class Solution {
    private List<Integer> nums = new ArrayList<>();
    public int minimumDeletions(String word, int k) {
        int[] frequ = new int[26];
        int n = word.length();
        for (int i = 0; i < n; i++) {
            ++frequ[word.charAt(i) - 'a'];
        }
        for (int v : frequ) {
            if (v > 0) {
                nums.add(v);
            }
        }

        int res = n;
        for (int i = 0; i <= n; i++) {
            res = Math.min(res, find(i, k));
        }
        return res;
    }

    int find(int v, int k) {
        int res = 0;
        for (int x : nums) {
            if (x < v) {
                res += x;
            } else if ( x > v + k) {
                res += x - v - k;
            }
        }
        return res;
    }
}