package Strings;
/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.



Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 */

public class ValidPalindromeII {
    public static void main(String[] args) {

   // String s = "abca";
    String s= "abc";

       boolean b = validPalindrome(s);
       if(b==true){
           System.out.println("String is valid Palindrome");
       }else{
           System.out.println("String is not a valid Palindrome");
       }

    }

    private static boolean validPalindrome(String s) {
        int i=0;
       int j=s.length()-1;

       while(i<j){
           if(s.charAt(i)!=s.charAt(j)){
              return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);

           }else{
               i++;
               j--;
           }
       }

       return true;

    }


    public static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }

        }
        return true;
    }


}
