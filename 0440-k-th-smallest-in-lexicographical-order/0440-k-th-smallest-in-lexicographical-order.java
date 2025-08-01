class Solution {
    public int findKthNumber(int n, int k) {
        long ans = 1;

    for (int i = 1; i < k;) {
      final long gap = getGap(ans, ans + 1, n);
      if (i + gap <= k) {
        i += gap;
        ++ans;
      } else {
        ++i;
        ans *= 10;
      }
    }

    return (int) ans;
  }

  private long getGap(long a, long b, long n) {
    long gap = 0;
    while (a <= n) {
      gap += Math.min(n + 1, b) - a;
      a *= 10;
      b *= 10;
    }
    return gap;
    }
}