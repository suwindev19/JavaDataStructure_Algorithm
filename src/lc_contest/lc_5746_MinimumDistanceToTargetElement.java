package lc_contest;

import java.util.HashMap;
import java.util.Map;

public class lc_5746_MinimumDistanceToTargetElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1;
        int start = 9;
        System.out.println(getMinDistance(nums, target, start));
    }
    public static int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i =0; i < map.size();i++){
            if (map.containsKey(target)){
                min = map.get(nums[i]);
            }
        }
        return Math.abs(min -start);
    }
}
