package leetCode;
/*
Input:  target = 7
        nums = [2,3,1,2,4,3]
Output: 2
        Explanation: The subarray [4,3] has the minimal length under the problem constraint.

        i at 0 => 2
        currentSum = 2
        count = 1
         2 < 7
         currentSum = 5
         count = 2
         currentSum =

 */
//nums = [2,3,1,2,4,3]
public class lc_209_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
    // [Java] Two Pointers & Brute Force
    public static int minSubArrayLen(int target, int[] nums) {
        int minCount = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int currentSum = 0;
            int currentCount = 0;
            for(int j = i; j < nums.length; j++){
                currentSum += nums[j];
                currentCount++;
                if(currentSum >= target){
                    minCount = Math.min(currentCount, minCount);
                    break;
                }
            }
        }
        return minCount;
    }
}
