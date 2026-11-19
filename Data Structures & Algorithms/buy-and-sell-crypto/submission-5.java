class Solution {
    public int maxProfit(int[] prices) {
        int bestMin = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(bestMin > prices[i])
                bestMin = prices[i];
            if(prices[i] - bestMin > maxProfit)
                maxProfit = prices[i] - bestMin;
        }
        return maxProfit;
    }
}
