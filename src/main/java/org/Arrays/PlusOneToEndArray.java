package org.Arrays;

public class PlusOneToEndArray {
    public static void main(String[] args) {
        int arr[] = {2,11,7,1};
        int arr1[] = {9};
        int[] res = plusOne(arr);
        for(int i =0;i<res.length;i++){
            System.out.print(+res[i] + " " );
        }
    }

    private static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[arr.length + 1];
        arr[0] = 1;
        return arr;

    }
}

