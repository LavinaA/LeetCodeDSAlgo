package org.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Note Method 1 will not work here as on sorting the indices will be lost

public class FindIndicesforTargetSum {
    public static void main(String[] args) {

        int arr[] = {2,11,7,15};
        int target = 9;
        //findIndicesForTargetMethod1(arr,target);
        int[] result = findIndicesForTargetMethod2(arr,target);
        System.out.println(result[0] +"," +result[1]);

    }
    private static int[]  findIndicesForTargetMethod2(int[] arr, int target) {
          //{2,7,11,15};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res[] = new int[2];

        for(int i=0;i<arr.length;i++){
            int key = target - arr[i];
            if(map.containsKey(key)){
                res[0] = i;
                res[1] = map.get(key);
                break;
            }else{
                map.put(arr[i],i);
            }
        }

return res;


    }

    /*private static void findIndicesForTargetMethod1(int[] arr, int target) {
        Arrays.sort(arr);

        int start =0;
        int end = arr.length-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (start < end) {

            int sum = arr[start] + arr[end];

            if( sum < target){
                start++;
            }else if (sum > target){
                end--;
            }else if ( sum == target){
                list.add(start);
                list.add(end);
                start++;
                end--;
            }

        }
        for(Integer i : list){
            System.out.println(i);
        }

    }
*/

}
