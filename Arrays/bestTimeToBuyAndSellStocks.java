public class bestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = {1,2,4,2,5,7,2,4,9,0,9};
        System.out.print(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        int j = 1;
        while(i < prices.length && j < prices.length){
            if(prices[i] < prices[j]){
                profit = Math.max(profit, prices[j]-prices[i]);
                j++;
            }
            else{
                i = j;
                j++;
            }
        }
        return profit;
    }
}
