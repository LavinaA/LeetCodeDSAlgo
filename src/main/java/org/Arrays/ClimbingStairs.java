package org.Arrays;

/*
You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
*/

public class ClimbingStairs {

    public static void main(String[] args) {

        int input = 3;
        int res = climbStairs(input);
        System.out.println(" The user can climb " + input + " stairs " + "in " +res + " no of ways");

    }

    private static int climbStairs(int input) {

        int dp[] = new int[input+1];
        int steps[] = {1,2};

        dp[0]=1;

        for(int i=1;i<=input;i++){
            for(int j=0;j<steps.length;j++){
                if(i-steps[j] >0 ) {
                    dp[i] = dp[i] + dp[i - steps[j]];
                }
            }


        }

        return dp[input];

    }

}
