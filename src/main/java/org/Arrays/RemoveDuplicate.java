package org.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = removeDuplicates(nums);
        System.out.println("The total number of elements present are " +count);


    }

    private static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i < nums.length;i++){
            int key = nums[i];
            if(map.get(key)==null){
                map.put(key,1);
            }
        }

        int k =0;

        for(Map.Entry<Integer,Integer> entry :map.entrySet() ){
            list.add(entry.getKey());
            k++;
        }

        //System.out.println(list);

        int unique[] = new int[k];
        for (int i = 0; i < list.size(); i++)
            unique[i] = list.get(i);

        System.out.println("The result array after removing duplicates is");
        for(int i = 0; i< unique.length; i++){
           System.out.print(unique[i]+ " ");
        }
        System.out.println();

        return k;

    }

    }


