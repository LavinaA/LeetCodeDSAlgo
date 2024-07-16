package org.Arrays;

/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/

public class FindRunningSum {
    public static void main(String[] args) {
    int nums[] = {1,2,3,4};
    int[] res = runningSum(nums);
    for(int i=0; i<res.length;i++){

        System.out.print(res[i] + " ");
    }


    }

    private static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }

}
