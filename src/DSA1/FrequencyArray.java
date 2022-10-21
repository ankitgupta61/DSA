package DSA1;

import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr  = {8,9,2,9,8,9};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i ++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], (map.get(arr[i]) + 1));
            }else{
                map.put(arr[i], 1);
            }
        }

//        System.out.println(map.entrySet());
        System.out.println(map.keySet());
//        for ({int key}: map.keySet()
//             ) {
//
//        }
//        int[] newArr = new arr[3];
//       map.keySet().toArray();

//        for (map:map.keySet()
//             ) {
//            System.out.println(map.key + ":" + map);
//        }
    }
}
