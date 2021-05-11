package hashing;
import java.util.HashMap;
import java.util.Map;
/*

O(n)
===========
size()
isEmpty()
 */
public class H5_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Osaka", 1);
        map.put("Nagoya", 2);
        map.put("Iwate", 3);
        map.put("Nara", 4);
        System.out.println(map);
        System.out.println(map.size());
        if (map.containsKey("Osaka")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        if(map.containsValue(2)){
            System.out.println("yes");
        }
        System.out.println(map.get("Iwate"));
        System.out.println(map.get("Tokyo"));
        map.remove("Iwate");
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey()+ " "+ e.getValue());
        }
    }
}
