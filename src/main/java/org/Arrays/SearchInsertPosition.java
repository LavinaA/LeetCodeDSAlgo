package org.Arrays;

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

        You must write an algorithm with O(log n) runtime complexity.



        Example 1:

        Input: nums = [1,3,5,6], target = 5
        Output: 2
        Example 2:

        Input: nums = [1,3,5,6], target = 2
        Output: 1
        Example 3:

        Input: nums = [1,3,5,6], target = 7
        Output: 4
*/

public class SearchInsertPosition {

    public static void main(String[] args) {

        int nums[] = {1,3,5,6};
        int target = 5;
        int pos = searchInsert(nums,target);
        System.out.println(pos);
    }

    private static int searchInsert(int[]arr, int target) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            count =i;
            if(arr[i] == target){
                return i;
            }else if (target < arr[0]){
                return 0;

            }else if(target > arr[arr.length-1]){
                return arr.length;
            } else if ( target > arr[i] && target < arr[i+1]){
                return count+1;
            }

        }
        return 0;


    }
}
