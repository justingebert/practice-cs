package Easy;

public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int curMin = Integer.MAX_VALUE;
        int curProfit = 0;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < curMin){
                curMin = prices[i];
            }
            curProfit = prices[i] - curMin;
            if(curProfit > maxProfit) {
                maxProfit = curProfit;
            }
        }
        return maxProfit;
    }
}
