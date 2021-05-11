package leetCode;

import java.util.HashMap;
import java.util.Map;

public class lc_13_Roman_To_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt_HashMap(s));
    }

    public static int romanToInt(String s){
        int result = 0;
        for(int i = s.length()-1; i>= 0; i--){
            char c = s.charAt(i);
            switch (c){
                case 'I':
                    result += (result >= 5 ? -1: 1);
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10 *(result >= 50 ? -1: 1);
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100 * (result >= 100 ? -1: 1);
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
            }
        }
        return result;
    }

    public static int romanToInt_HashMap(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int i = 0, j = 1;
        for(; j < s.length(); i++, j++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(j))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        result += map.get(s.charAt(i));
        return result;
    }
}
