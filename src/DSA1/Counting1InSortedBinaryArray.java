package DSA1;

public class Counting1InSortedBinaryArray {
    static int count = 0;
    public static void count1(int[] arr, int s, int e){
        if(s <= e){
            if(s == e){
                if(arr[s] == 1){
                    count++;
                    return;
                }
                return;
            }
            int m = s + ((e-s)/2);
            if(arr[m] == 1){
                count += (e-m);
                count1(arr, s ,m);
            }else{
                count1(arr, m+1, e);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1};
        int n = arr.length;
        count1(arr, 0, n-1);
        System.out.println(count);
    }
}
