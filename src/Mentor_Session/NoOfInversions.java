package Mentor_Session;

import com.sun.security.jgss.GSSUtil;

public class NoOfInversions {
    static int inversionCount = 0;
    public static int countInversions(int[] arr) {
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        return inversionCount;
    }
    public static void mergeSort(int[] arr, int s, int e){
        if(s < e){
            int m = s + ((e-s)/2);
            mergeSort(arr, s, m);
            mergeSort(arr, m+1, e);
            merge(arr, s, m, e);
        }
    }
    public static void merge(int[] arr, int s, int m, int e){
        int aLength= m-s + 1;
        int bLength = e-m;

        int[] a = new int[aLength];
        int[] b = new int[bLength];

        int x = s;
        for(int i = 0; i < aLength; i++){
            a[i] = arr[x++];
        }
        int y = m+1;
        for(int i = 0; i < bLength; i++){
            b[i] = arr[y++];
        }

        int i = 0;
        int j = 0;
        int k = s;

        while(i < aLength && j < bLength){
            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }else{
                inversionCount += aLength-i;
                arr[k++] = b[j++];
            }
        }

        while(i < aLength){
            arr[k++] = a[i++];
        }
        while(j < bLength){
            arr[k++] = b[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(countInversions(arr));
    }
}
