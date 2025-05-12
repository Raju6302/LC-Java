class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], maxProfit = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            int nextDay = prices[i] - buy;
            maxProfit = Math.max(maxProfit, nextDay);
            buy = Math.min(prices[i], buy);
        }

        return maxProfit;
        
    }
}