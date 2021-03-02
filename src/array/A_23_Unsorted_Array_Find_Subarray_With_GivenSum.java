package array;

public class A_23_Unsorted_Array_Find_Subarray_With_GivenSum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 20, 3, 10, 5};
        int givenSum = 398;
//        System.out.println(isSubArrayWithGivenSum(nums, givenSum));
        System.out.println(isSubArrayWithGivenSum_Efficient(nums, givenSum));
    }

    // Time O(n^2)
    // Space O(1)
    public static boolean isSubArrayWithGivenSum(int[] nums, int givenSum){
        for(int i = 0; i < nums.length; i++){
            int currentSum = 0;
            for(int j = i; j < nums.length; j++){
                currentSum += nums[j];
                if(currentSum == givenSum)
                    return true;
            }
        }
        return false;
    }

    // Time O(
    // keep adding sum to the currentSum while the currentSum is less than the given Sum and then once it is greater
    // subtract the first and subsequent elements and compare until smaller or equal sum
    public static boolean isSubArrayWithGivenSum_Efficient(int[] nums, int givenSum){
        int currentSum = nums[0], startOfWindow = 0;
        for(int endOfWindow = 1; endOfWindow < nums.length; endOfWindow++){
            // clear the previous window
            while(currentSum > givenSum && startOfWindow< endOfWindow -1){
                currentSum -= nums[startOfWindow];
                startOfWindow++;
            }
            if(currentSum == givenSum)
                return true;
            if(endOfWindow < nums.length)
                currentSum += nums[endOfWindow];
        }
        return currentSum == givenSum;
    }
}
