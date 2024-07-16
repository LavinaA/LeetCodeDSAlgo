package org.Arrays;
/*Given two integer arrays nums1 and nums2, return an array of their
        intersection
        . Each element in the result must be unique and you may return the result in any order.
        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [9,4]
        Explanation: [4,9] is also accepted.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    int nums1[] = {1,2,2,1};
    int nums2[] = {2,2};

    //int[] res = intersectionApproach1(nums1,nums2);
    int[] res1 = intersectionApproach2(nums1,nums2);


        for(int i=0;i<res1.length;i++){
            System.out.print(res1[i] + " ");
        }

    }

    public static int[] intersectionApproach1(int[] nums1, int[] nums2){
        int[] countarr = new int[1001];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(Integer i : nums1 ){
            countarr[i] = 1;
        }

        for(Integer j : nums2){
            if(countarr[j]==1){
                countarr[j]=2;
            }
        }

        for(int i=0;i<countarr.length;i++){
            if(countarr[i]==2){
                list.add(i);
            }
        }

        //Convert list to array
        int[] resarr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            resarr[i] = list.get(i);
        }
        return resarr;
    }



    public static int[] intersectionApproach2(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int next: nums1) {
            set1.add(next);
        }
        for (int next: nums2) {
            if (set1.contains(next)) {
                set2.add(next);
            }
        }
        int[] res = new int[set2.size()];
        int i =0;
        for (int next: set2) {
            res[i] = next;
            i++;
        }
        return res;
    }
}
