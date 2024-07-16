package org.Arrays;

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
