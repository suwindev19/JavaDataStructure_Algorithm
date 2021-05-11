package hashMap;

import java.util.HashMap;

public class HM_4_Count_Frequencies {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 30, 30, 30};
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i =1; i <= array.length; i++){
            m.put(array[i], i);
        }
    }
}
