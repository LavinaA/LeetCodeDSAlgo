package org.Arrays;

/*Example 1:

        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).*/

public class RemoveElement {
    public static void main(String[] args) {

        int arr[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int count = removeElement(arr,val);
        System.out.println();
        System.out.println("count of Elements: " +count);

    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }


        System.out.println("Output Array");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }

        return k;


    }
}
