package DynamicProgramming;

public class Knapsack01Recursive {
    public static int knapsackMaxProfit(int[] wt, int[] val, int W, int n){
        if(n == 0 || W <= 0){
            return 0;
        }
        if( wt[n-1] > W){
            return 0;
        }
        int profit1 = val[n-1] + knapsackMaxProfit(wt, val, W - wt[n-1], n-1);
        int profit2 = knapsackMaxProfit(wt, val, W, n-1);
        return Math.max(profit1, profit2);
    }
    public static void main(String[] args) {
        int [] weight = {4,3,2,5};
        int[] value = {9,4,5,7};

        int W = 7;
        System.out.println(knapsackMaxProfit(weight, value, W, weight.length));
    }
}
