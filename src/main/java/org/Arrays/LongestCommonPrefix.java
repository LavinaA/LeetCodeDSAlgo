package org.Arrays;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String str[] = {"flower", "flow", "flight"};
        String res = findLongestCommonPrefix(str);
        System.out.println(" the longest commoon prefix is " +res);

    }

    private static String findLongestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length-1];
        int i=0;

        while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,i);

    }
}
