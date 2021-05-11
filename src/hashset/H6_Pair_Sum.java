package hashset;

import java.util.HashSet;

public class H6_Pair_Sum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 8, 15, -8};
        int target = 17;
//        pairSum_Naive(nums, target);
//        pairSum_HashSet(nums, target);
    }

    public static int[] pairSum_Naive(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        for (Integer i : result) {
            System.out.println(i);
        }
        return result;
    }

//    public static int[] pairSum_HashSet(int[] nums, int target) {
//        java.util.Set<Integer> set = new HashSet<>();
//        int[] result = new int[2];
//        for(Integer i : nums) {
//            if ()
//        }
//        return result;
//    }
}
