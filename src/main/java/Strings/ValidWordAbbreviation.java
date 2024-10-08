package Strings;
/*
A string can be abbreviated by replacing any number of non-adjacent, non-empty substrings with their lengths. The lengths should not have leading zeros.

For example, a string such as "substitution" could be abbreviated as (but not limited to):

"s10n" ("s ubstitutio n")
"sub4u4" ("sub stit u tion")
"12" ("substitution")
"su3i1u2on" ("su bst i t u ti on")
"substitution" (no substrings replaced)
The following are not valid abbreviations:

"s55n" ("s ubsti tutio n", the replaced substrings are adjacent)
"s010n" (has leading zeros)
"s0ubstitution" (replaces an empty substring)
Given a string word and an abbreviation abbr, return whether the string matches the given abbreviation.
 */

public class ValidWordAbbreviation {
    public static void main(String[] args) {

        String word = "apple";
        String abbr = "a2e";

        Boolean b = validWordAbbreviation(word,abbr);

        if(b==true){
           // System.out.println("The string "+abbr +" is an abbreviation for string "+word );
            System.out.println("True");
        }else{
            //System.out.println("The string "+abbr +" is not the correct abbreviation for string "+word);
            System.out.println("False");
        }


    }

    private static Boolean validWordAbbreviation(String word, String abbr) {
        int i=0;
        int j=0;
        //int start =0;

        while (i < word.length() && j < abbr.length()) {
            if(word.charAt(i) == abbr.charAt(j)){
                i++;
                j++;
                continue;
            }
            // Check for not a number
           if(abbr.charAt(j) < '0' || abbr.charAt(j) > '9'){
               return false;
           }
           int start = j;
           // If abbreviated string has a number
           while(j<abbr.length() && abbr.charAt(j) >='0' && abbr.charAt(j) <='9'){
               j++;

           }
           int num = Integer.parseInt(abbr.substring(start,j));
            System.out.println(num);
            i = i + num;
        }


return i==word.length() && j==abbr.length();

    }


}
