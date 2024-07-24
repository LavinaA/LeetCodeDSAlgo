package Strings;
/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */

import apple.laf.JRSUIUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstUniqueCharInString {
    public static void main(String[] args) {

    String s = "loveleetcode";
    int index = findFirstUniqueChar(s);
    System.out.println("The index of first unique character is " +index);

    }

    private static Integer findFirstUniqueChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){
                Character ch = s.charAt(i);
            if(map.get(ch)==null){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }

        }

       // int count =0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                Character c =entry.getKey();
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)==c){
                        return i;
                    }
                }
            }
        }

       return -1;

    }
}
