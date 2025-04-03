package org.Arrays;
/*
Find minimum number in the array and from the same column find the max number

 */

public class FindMinMaxinSameCol {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {5,8,9},
                {10,11,12},
                {6,13,14}
        };

        int min = Integer.MAX_VALUE;
        int temp =0;

        for( int i=0;i<arr.length;i++){
            for( int j=0;j<arr[0].length;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    temp = j;
                }
            }
        }

        System.out.println(min);
        System.out.println(" tHe column number where min element is present is " +temp);

        int max = Integer.MIN_VALUE;
        for( int i=0;i<arr.length;i++){
            if(arr[i][temp] > max){
                max = arr[i][temp];
            }

        }

        System.out.println(" The maximum element in column " + temp + " is " + max);

    }
}
