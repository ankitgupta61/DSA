package Mock;


import java.util.Arrays;

public class subSetSum {
    public static  boolean isSubsetSum(int[] set, int sum){
        Arrays.sort(set);
        int cummulativeSum = 0;
        int n = set.length;
        for(int i = 0; i < n; i++){
            cummulativeSum += set[i];
            for(int j = 0; j < n; j++){
                if(i != j){
                    cummulativeSum += set[j];
                    if(cummulativeSum == sum){
                        return true;
                    }
                }
            }
            for(int k = 0; k < n; k++){
                if(i != k){
                    cummulativeSum -= set[k];
                    if(cummulativeSum == sum){
                        return true;
                    }
                }
            }
            sum = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(set, sum));
    }
}