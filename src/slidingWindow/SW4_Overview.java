package slidingWindow;
/*
Sliding Window
- is used for finding subarrays in an array that satisfy given condition
- maintain a subset of items as your window
- resize and move that window within the larger list until you find a solution
- subset of Dynamic Programming
- DP - is a technique of solving a problem via dividing it into sub-problems

- Sliding Window
    Time O(n)
    Space O(1) = constant space
    subarray, substring related questions
Find the subarrays that add up to 9
{ 1, 2, 3, 4, 5, 6, 7, 8, 9}
  ----
  -------
  ----------
      ------

Question: Given an array of integers,
find maximum sum subarray of the required size.
subarray are contagious by definition,
so the elements should be adjacent.
{ -1, 2, 3, 1, -3, 2}
subarray size = 2
input size can be anything

Analysis
- input size is unlimited, so memory can blow up if we are not careful of what we keep in memory
    - Do not precalculate and store all possible variations (brute force appraoch)
    - Do not use recursion. Call stack can overflow
- Think through all data structures that can be utilised.

Approach 1 : Brute Force
========================
1. Calculate all possible subarrays with 2 members and store them in a hashtable
2. Iterate them over the hashtable until you find the subarray with maxsum
Time O(n) for hashtable creation , space is O(1) for every lookup
Space O(n)

input size is unbound, memory used is unbound

Approach 2 : Sliding Window (statically sized)
=============================================
1. start calculating window sum with the first 2 elements
2. Then slide one window by one element at a time

{ -1, 2, 3, 1, -3, 2 }
  ----- 1
      ---- 5
        ----- 4
            ----- -2
               ----- -1
 Time O(n)
 Space O(1)
 */
public class SW4_Overview {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int targetSum = 7;
//        int subarraySize = 2;
//        System.out.println(maximumSubArray(nums));
//        System.out.println(maximumSubArray_SlidingWindow(nums));

    }
    // Use DP programming
    // know the subproblem
    // start a new subarray at an item and end at its index itself
    // continue the maximum subarray sum coming before (previous best)
    public static int maximumSubArray(int[] nums){
        if(nums.length < 2) return nums[0];
        int maxSum = nums[0];
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    // Dynamic window sliding patterns
    // never calculate the elements
    public static int maximumSubArray_SlidingWindow(int[] nums){
        int maxSum = Integer.MIN_VALUE , start =0 , currentSum = 0;
        // dynamically changing part is start of the window
        for(int end = 0; end < nums.length; end++){
            currentSum += nums[end];
            maxSum = Math.max(maxSum, currentSum);
            while (currentSum < 0){
                currentSum -= nums[start];
                start++;
            }
        }
        return maxSum;
    }

}
