package org.Arrays;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String s = "()[]{}";
        boolean b = isValidParenthesis(s);
        if(b== true){
            System.out.println(" The Paranthesis are valid");
        }else{
            System.out.println(" The Paranthesis are not valid");
        }



    }

    private static boolean isValidParenthesis(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='{' || s.charAt(i)== '(' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            /*else if(stack.isEmpty()){
                    System.out.println("invalid");
                    return false;
                }*/
            else {

                int poppedElement = stack.pop();

                if(  (s.charAt(i)==')' && poppedElement == '(') || (s.charAt(i)=='}' && poppedElement == '{') ||  (s.charAt(i)==']' && poppedElement == '[') ){
                    continue;
                }else {
                    return false;
                }

            }

        }
        if(!stack.isEmpty()){
            return false;
        }

return true;
    }
}
