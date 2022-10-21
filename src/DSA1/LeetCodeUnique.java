package DSA1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class LeetCodeUnique {
    public static void intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        int maxLength = Math.max(nums1.length, nums2.length);
        int[] arr = new int[maxLength];
        Arrays.fill(arr, -1);
        int x = 0;
//        for(int i = 0; i < nums2.length; i++){
//            if(set1.contains(nums2[i])){
//                arr[x++] = nums2[i];
//            }
//        }
        System.out.println(set1);
//        System.out.println(set1.stream().count());









//        int nums1Length = nums1.length;
//        int nums2Length = nums2.length;
//
//        int maxLength = Math.max(nums1Length, nums2Length);
//        int[] arr = new int[maxLength];
//        Arrays.fill(arr,-1);
//        int x = 0;
//
//        for(int i = 0; i< nums1Length; i++){
//            int value = nums1[i];
//            for(int j = 0; j < nums2Length; j++){
//                if(nums2[j] == value){
//                    arr[x++] = value;
//                    break;
//                }
//            }
//        }
//
//        Arrays.sort(arr);
//        int[] b = new int[maxLength];
//        Arrays.fill(b, -1);
//        b[0] = arr[0];
//        int y = 1;
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] == arr[i-1]){
//                continue;
//            }
//            b[y++] =  arr[i];
//        }
//        int actualLength = 0;
//        for(int i = 0; i < b.length; i++){
//            if(b[i] == -1){
//                continue;
//            }
//            actualLength++;
//        }
//        int[] actualArray = new int[actualLength];
//        int z = 0;
//        for(int i = 0; i < b.length; i++){
//            if(b[i] == -1){
//                continue;
//            }
//            actualArray[z++] = b[i];
//        }
//        for(int i = 0; i < actualLength; i++){
//            System.out.print(actualArray[i] + " ");
//        }



    }
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        intersection(num1, num2);
    }
}
