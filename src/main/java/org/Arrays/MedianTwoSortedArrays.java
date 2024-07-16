package org.Arrays;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {3,4,5,6};
        double median = medianTwoSortedArray(arr1,arr2);
        System.out.println("The median is "+median );
    }

    private static double medianTwoSortedArray(int[] num1, int[] num2) {
        int reslength = num1.length + num2.length;
        int res[] = new int[num1.length + num2.length];
        int i=0,j=0,k=0;
        double median = 0;

        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                res[k] = num1[i];
                k++;
                i++;
            } else  {
                res[k] = num2[j];
                k++;
                j++;
            }
        }

        while (i < num1.length) {
                res[k] = num1[i];
                i++;
                k++;

        }
        while(j<num2.length) {
                res[k] = num2[j];
                k++;
                j++;
        }
        for (int l = 0; l < res.length; l++) {
            System.out.println(res[l]);
        }
        if (reslength % 2 == 0) {
            median = res[reslength/2] + res[reslength+2/2];
        }
        else{
            median = res[reslength/2];
        }
        return median;

    }
}
