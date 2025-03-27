class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;
        
        int[] trustCount = new int[n + 1];
        int[] trustOthers = new int[n + 1]; 
        
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0], b = trust[i][1];
            trustOthers[a]++;
            trustCount[b]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (trustOthers[i] == 0 && trustCount[i] == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}