package org.Arrays;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println(" The profit is " + profit);
    }
    private static int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int profit;

        int counter =0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                counter++;
            }
        }

        int pos = counter--;
        System.out.println(" the minimum value is " +min);
        System.out.println(" the index of lowest value is " +pos);

        for(int i =pos;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(" the maximum value is " +max);
        if(min>max){
            return 0;
        }
        return (max-min);
    }
}
