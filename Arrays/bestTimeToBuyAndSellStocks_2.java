class Solution {
    public static void main(String[] args) {
        int prices[] = {1,2,3,4,5};
        System.out.print(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 0; i<prices.length-1; i++){
            profit += Math.max(0, prices[i+1]-prices[i]);
        }
        return profit;
    }
}