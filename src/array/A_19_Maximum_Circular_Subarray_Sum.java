package array;

public class A_19_Maximum_Circular_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        System.out.println(overallMaximumSum(nums));
    }

    public static int maxCircularSubarraySum(int[] nums){

        int maxSum = nums[0];
        for(int i = 0; i < nums.length; i ++){
            int currentMax = nums[i];
            int currentSum = nums[i];
            for(int j = 1; j < nums.length; j++){
                int index = (i+j)% nums.length;
                currentSum += nums[index];
                currentMax = Math.max(currentSum, currentMax);
            }
            maxSum = Math.max(currentMax, maxSum);
        }
        return maxSum;
    }


    // normal Kadane's algorithm
    public static int normalMaximumSum(int[] nums) {
        int result = nums[0];
        int maxEnding = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxEnding = Math.max(nums[i], (maxEnding + nums[i]));
            result = Math.max(result, maxEnding);
        }

        return result;
    }

    // Overall sum -> modified version of Kadane's algorithm
    public static int overallMaximumSum(int[] nums){
        int normalMax = normalMaximumSum(nums);
        if(normalMax < 0) return normalMax;
        int arrSum = 0;
        for(int i = 0; i < nums.length; i++){
            arrSum += nums[i];
            nums[i] = -nums[i];
        }
        int maxCircularSum = arrSum + normalMaximumSum(nums);
        return Math.max(normalMax, maxCircularSum);

    }

}
