package array;
import java.lang.Integer;
/*
Given an array  of integer and a number k, find the maximum sum of k consecutive elements.

 */
public class A_22_Sliding_Window {
    public static void main(String[] args) {
        int[] nums =  {1, 8, 30, -5, 20, 7};
        int k = 3;
        int givenSum = 44;
//        System.out.println(maxSum(nums, k));
//        System.out.println(maxSum_Efficient(nums, k));
        System.out.println(maxSum_Efficient_GivenSum(nums, k, givenSum));
    }

    // Time O(n^2)
    // Space O(1)
    public static int maxSum(int[] nums, int k){

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i + k-1 < nums.length; i++ ){
            int currentSum = 0;
            for(int j = 0; j < k; j++){
                currentSum += nums[i+j];
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    // window sliding technique
    // int[] nums =  {1, 8, 30, -5, 20, 7};
    //                x          +  to get the next element
    // Time O(n)
    public static int maxSum_Efficient(int[] nums, int k){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < k; i++){ // O(k)
            currentSum += nums[i];
        }
        maxSum = currentSum;
        // end of current window and beginning of a new window
        for(int i = k; i < nums.length; i++){ // O(n-k)
            currentSum += nums[i] - nums[i-k];
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    // Modified
    // Given array = int[] nums =  {1, 8, 30, -5, 20, 7};
    // k = 3
    // find if there is a subarray of size k with given sum , find boolean value
    // Come back to this later.
    public static boolean maxSum_Efficient_GivenSum(int[] nums, int k, int givenSum){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < k; i++){ // O(k)
            currentSum += nums[i];
        }
        maxSum = currentSum;
        if(maxSum == givenSum){
            return true;
        }
        // end of current window and beginning of a new window
        for(int i = k; i < nums.length; i++){ // O(n-k)
            currentSum += nums[i] - nums[i-k];
            maxSum = Math.max(currentSum, maxSum);
        }
        if(maxSum == givenSum){
            return true;
        }else
            return false;
    }

}
