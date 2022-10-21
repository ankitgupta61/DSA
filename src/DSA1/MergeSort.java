package DSA1;

public class MergeSort {
    public static void mergeSort(int[] arr, int s, int e){
        if(s < e){

            int m = s + ((e-s)/2);
//            System.out.println(s + " " + m + " " + e);
            mergeSort(arr, s, m);
            mergeSort(arr,m+1, e);
            merge(arr, s, m, e);
        }
    }
//    4,1
    public static void merge(int[] arr, int s, int m, int e){
        int aLength = m-s + 1;
        int bLength = e-m;
        int[] a = new int[aLength];
        int[] b = new int[bLength];
//        System.out.println(aLength + " " + bLength);

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

        while( i< aLength && j < bLength){
            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }else{
                arr[k++] = b[j++];
            }
        }

        while(i < aLength){
            arr[k++] = a[i++];
        }

        while(j < bLength){
            arr[k++] = b[j++];
        }
//        for(int p = 0; p < arr.length; p++){
//            System.out.print(arr[p] + " " );
//        }
//        System.out.println();
    }

    public static void getArrayWithUniqueElement(int[] arr, int n){
        System.out.print(arr[0] + " ");
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int [] b = new int[n];
        int x = 1;
        b[0] = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            b[x++] = arr[i];
        }

        for(int i = 0; i < n; i++){
            if(b[i] == 0){
                continue;
            }
            System.out.print(b[i] + " ");
        }
    }



    public static void main(String[] args) {
        int [] arr = {1,4,2,5,7,9,10,7,4};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        getArrayWithUniqueElement(arr, n);
    }
}
