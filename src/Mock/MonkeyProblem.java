package Mock;

import java.util.Arrays;

public class MonkeyProblem {
    public static int getMinNoOfMonkey(int[] input){
        Arrays.sort(input);
        int n = input.length;
        int noOfMonkeys = 0;
        for(int i = 0; i < n; i++){
            noOfMonkeys = noOfMonkeys + input[i] +1;
            int endLimit = i + input[i];
            while((i+1 < n ) && (input[i+1] == input[i]) && (i < endLimit)) {
                i++;
            }
        }
        return noOfMonkeys;

    }
    public static void main(String[] args) {
        int[] input = {1,1};
        System.out.println(getMinNoOfMonkey(input));
    }
}
