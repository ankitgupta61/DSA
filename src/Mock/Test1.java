package Mock;

import java.util.*;

public class Test1 {

    public static int getSecondLargestElement(int[] arr, int n){
        int firstLargestElement = Integer.MIN_VALUE;
        int firstLargestIndex = 0;
        for(int i = 0; i < n; i++){
            if(firstLargestElement <= arr[i]){
                firstLargestElement = arr[i];
                firstLargestIndex = i;
            }
        }
        arr[firstLargestIndex] = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(secondLargestElement <= arr[i]){
                secondLargestElement = arr[i];
            }
        }
        return secondLargestElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int secondLargestElement = getSecondLargestElement(arr,n);
        System.out.println(secondLargestElement);
    }
}
