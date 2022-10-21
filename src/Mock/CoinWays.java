package Mock;

public class CoinWays {
    static int[] arr = new int[5];

    public static int getNoOfWays (int N){
        if(N <= 0) {
            return 0;
        }
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 2;
        }
        if(N == 3){
            return 3;
        }
        if(arr[N] != 0) {
            return arr[N];
        }
        System.out.println(N);
        int sum = getNoOfWays(N-1) + getNoOfWays(N-3);
        System.out.println(sum);
        arr[N] = sum;
        return sum;
    }


    public static void main(String[] args) {
        int N = 4;
        int[] S = {1,2,3};
        System.out.println(getNoOfWays(N));
    }
}
