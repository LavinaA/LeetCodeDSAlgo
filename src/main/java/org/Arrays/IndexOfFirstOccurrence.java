package org.Arrays;

/*
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String s1 = "sadbutsad";
        String s2 = "sad";

        int index = findIndex(s1,s2);
        System.out.println(" The String " +s2 +" is found at index " +index);

    }

    private static int findIndex(String s1, String s2) {
        int strlength = s1.length() - s2.length();
        for (int i = 0; i <= strlength ; i++) {

            if (s1.charAt(i) != s2.charAt(0)) {
                continue;
            } else {

                int count = 0;
                int temp = i;
                int var =i;
                for (int j = 0; j < s2.length(); j++) {

                    if (s1.charAt(temp) != s2.charAt(j)) {
                        break;
                    } else {
                        temp++;
                        count++;
                    }

                    if (count == s2.length()) {
                        return var;
                    }
                }

            }
        }
        return -1;

    }
}
