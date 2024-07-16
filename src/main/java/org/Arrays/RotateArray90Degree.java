package org.Arrays;

/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */



public class RotateArray90Degree {
    public static void main(String[] args) {


        int a[][] = {{1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
        };
        int[][] arr = reverseRows(a);
        int[][] result = transpose(arr);

        for (int i = 0; i <= result.length - 1; i++) {
            for (int j = 0; j <= result[0].length - 1; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    //Transpose matrix
    private static int[][] transpose(int[][] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    private static int[][] reverseRows(int[][] arr){
         int rowstart = 0;
         int rowend = arr.length-1;
         int temp;

         //reverse Rows of a matrix

         for( int j=0;j<arr[0].length;j++){
             while(rowstart < rowend){
                 temp = arr[rowstart][j];
                 arr[rowstart][j] = arr[rowend][j];
                 arr[rowend][j] = temp;
                 rowstart++;
                 rowend--;
             }
             rowend = arr.length-1;
             rowstart=0;

         }
        return arr;
    }
}
