/**
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * 
 * Find the maximum profit you can achieve. You may complete as many
 * transactions as you like (i.e., buy one and sell one share of the stock
 * multiple times).
 * 
 * Note: You may not engage in multiple transactions simultaneously (i.e., you
 * must sell the stock before you buy again).
 * 
 * @author Madhan_Krish
 *
 */
public class BuySellStock {

	public static void main(String[] args) {
		int[] input1 = {7,1,5,3,6,4};
		int[] input2 = {1,2,3,4,5};
		System.out.println(maxProfit(input2));

	}

	public static int maxProfit(int[] prices) {
		int max = 0;
		for (int i = prices.length - 1; i > 0; i--) {
			if (prices[i] > prices[i - 1]) {
				max += (prices[i] - prices[i - 1]);
			}
		}
		return max;
	}

}
