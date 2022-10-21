package DynamicProgramming;

import java.util.*;

public class KnapsackDPMemoization {
    static int[][] dp = new int[8][5];
    public static int knapsackMaxProfit(int[] wt, int[] val, int W, int n){
        if(n == 0 || W <= 0){
            return 0;
        }
        if(dp[W][n] != -1){
            return dp[W][n];
        }
        if( wt[n-1] > W) {
            dp[W][n] = knapsackMaxProfit(wt, val, W, n - 1);
            return dp[W][n];
        }
        int profit1 = val[n-1] + knapsackMaxProfit(wt, val, W - wt[n-1], n-1);
        int profit2 = knapsackMaxProfit(wt, val, W, n-1);
        dp[W][n] = Math.max(profit1, profit2);
        return dp[W][n];
    }
    public static void main(String[] args) {
        int [] weight = {4,3,2,5};
        int[] value = {9,4,5,7};
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int W = 7;
        System.out.println(knapsackMaxProfit(weight, value, W, weight.length));
    }
}
