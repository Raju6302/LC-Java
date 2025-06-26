class Solution {
    public int longestSubsequence(String s, int k) {
        int res = 0;
        int v = 0;

        for (int i = s.length() - 1; i >= 0;  i--)  {
            if (s.charAt(i) == '0') {
                res++;
            }  else if (res < 30 && (v | 1 << res) <= k) {
                v |= 1 << res;
                res++;
            }
        }

        return res;
    }
}