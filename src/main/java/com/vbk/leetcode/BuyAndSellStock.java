package com.vbk.leetcode;

public class BuyAndSellStock {

	public static int maxProfit(int[] prices) {
		
		
		//Brute force approach - Will result in Time Limit exceeded
	       /* int result = 0;
	        int i=0;
	        while(i < prices.length) {
	            int profit = dp(prices, i);
	            if(profit > result) {
	                result = profit;
	            }
	            i++;
	        }
	    return result;
	    */

	    int minPrice = Integer.MAX_VALUE, profit=0;

	        for(int i=0; i<prices.length; i++) {
	            if(prices[i] < minPrice) {
	                minPrice=prices[i];
	            } else if(prices[i] - minPrice > profit) {
	                profit = prices[i] - minPrice;
	            }
	        }
	        return profit;

	    }

	// Used in Brute force approach
	    public int dp(int[] prices, int index) {
	        int number = prices[index];
	        int profit = 0;
	        for(int i=index+1; i<prices.length; i++){
	            if(prices[i] > number && (prices[i] - number) > profit) {
	                profit = prices[i] - number; 
	            }
	        }
	        return profit;
	    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}

}
