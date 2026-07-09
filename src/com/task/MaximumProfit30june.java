package com.task;

public class MaximumProfit30june {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int minprice = prices[0];
		int maxprofit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice) {
				minprice = prices[i];

			}

			int profit = prices[i] - minprice;
			
			if(profit>maxprofit) {
				
				maxprofit=profit;
			}

		}
		
		System.out.println("maximum profit:" + maxprofit);

	}

}
