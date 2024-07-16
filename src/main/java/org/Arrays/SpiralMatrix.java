package org.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                /*{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}*/
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

    List<Integer> result = spiralOrder(arr);
    for(Integer l : result){
        System.out.println(l);
    }


    }

    private static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<Integer>();

        int rowstart =0;
        int rowend= arr.length-1;
        int colstart =0;
        int colend = arr[0].length-1;

        while(rowstart<=rowend && colstart <= colend){

            for(int j =colstart ; j<= colend;j++){
                list.add(arr[rowstart][j]);
            }

            for(int j =rowstart+1 ; j<= rowend;j++){
                list.add(arr[j][colend]);
            }

            //if(rowstart!=rowend) {
                for (int j = colend - 1; j >= colstart; j--) {
                    list.add(arr[rowend][j]);
                }
           // }

            //if(colstart!=colend){
                for(int j =rowend-1 ; j>= rowstart+1;j--) {
                    list.add(arr[j][colstart]);
                }
            //}

            rowstart++;
            rowend--;
            colstart++;
            colend--;

        }
        return list;
     }
    }

