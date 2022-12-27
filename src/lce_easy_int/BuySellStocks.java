package lce_easy_int;

public class BuySellStocks {
	public static void main(String[] args) {
		int[] prices = { 7,1,5,3,6,4 };
		System.out.println(maxProfit(prices));
	}

	// My soln
	public static int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] < prices[j] && prices[j] - prices[i] > profit) {
					profit = prices[j] - prices[i];
				}
			}
		}
		return profit;
	}
	
	// leetcode best soln
//	 public int maxProfit(int[] prices) {
//	        int lsf = Integer.MAX_VALUE;
//	        int op = 0;
//	        int pist = 0;
//	        
//	        for(int i = 0; i < prices.length; i++){
//	            if(prices[i] < lsf){
//	                lsf = prices[i];
//	            }
//	            pist = prices[i] - lsf;
//	            if(op < pist){
//	                op = pist;
//	            }
//	        }
//	        return op;
//	    }
}
