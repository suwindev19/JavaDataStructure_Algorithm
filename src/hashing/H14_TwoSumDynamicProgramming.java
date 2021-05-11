package hashing;

import java.util.HashMap;
import java.util.Map;

public class H14_TwoSumDynamicProgramming {
    private int[] nums;
    private int S;

    public H14_TwoSumDynamicProgramming(int[] nums, int S){
        this.nums = nums;
        this.S = S;
    }

    public static int[] twoSumDynamicProgramming(int[] nums, int S){
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            // check the remainder
            int remainder = S - nums[i];
            // check if the remainder exists in the hashtable
            // O(1)
            if(map.containsKey(remainder)){
                result[0] = i;
                result[1] = map.get(remainder);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
    // 3 0
    // 2 1
    // 4 2
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int S = 6;
        int[] result = twoSumDynamicProgramming(nums, S);
        for(int i : result){
            System.out.println(i);
        }
    }
}
