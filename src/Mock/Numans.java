package Mock;

import java.util.HashMap;

public class Numans {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static int addTo256(int x){
        if(map.containsKey(x)){
            return map.get(x);
        }
        map.put(x,x+256);
//        System.out.println(map.get(20));
        return map.get(x);
    }
    public static void main(String[] args) {
        int x = 20;
        System.out.println(addTo256(x));
        System.out.println(addTo256(40));
        System.out.println(addTo256(20));
    }
}
