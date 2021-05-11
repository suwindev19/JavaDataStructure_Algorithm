package string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LC_340_Longest_Substring_with_At_Most_K_Distinct_Characters {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(lengthOfLongestSubStringKDistinct(s,k));
    }
    // n is the length of the string
    // Time O(n*k)
    // Space O(k)
    public static int lengthOfLongestSubStringKDistinct(String s, int k){
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int maxLen = 0;
        // edge case check
        if (s == null || s.length() == 0 ) return 0;
        for(end =0; end < s.length();end++){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0)+1);
            while (map.size() > k){
                if (start <= end && map.get(s.charAt(start)) > 0 ){
                    map.put(s.charAt(start), map.get(s.charAt(start)) -1);
                }
                if (map.get(s.charAt(start)) == 0)
                    map.remove(s.charAt(start));
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
