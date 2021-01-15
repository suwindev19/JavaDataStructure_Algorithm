package hashing;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, -4, 8, 11};
        int sum = 7;
//        twoSumNative(nums, sum);
        twoSumDynamicProgramming(nums, sum);

    }

    // O(n^2)
    public static void twoSumNative(int[] nums, int sum){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i]+ nums[j] == sum){
                    System.out.println("Solution is " + nums[i] + " + " + nums[j] + " = " + sum);
                }
            }
        }
    }

    // O(n)
    public static void twoSumDynamicProgramming(int[] nums, int sum){
        Map<Integer, Integer> hashTable = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int remainder = sum - nums[i];
            if(hashTable.containsValue(remainder))
                System.out.println("Solution : " + nums[i] + " + " + remainder + " = " + sum);
            hashTable.put(i, nums[i]);
        }
    }
}
