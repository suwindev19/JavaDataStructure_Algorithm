package W2_Arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class W2_1_Two_Sum {
    // not printing the result, but the object ?
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum_ON2(nums, target));
        System.out.println(twoSum_Hashtable(nums, target));
    }
    // Brainstorming
    // Approach 1: Use two for loops, Traverse the array twice. First go through the array. And then add each number when traversing through the second array and find sum
    //             : Start from first element. With this approach, it will be O(n^2) since we are going to traverse through the string twice.
    public static int[] twoSum_ON2(int[] nums, int target){
        for(int i = 0; i < nums.length -1; i++){
            int firstNum = nums[i];

            for(int j = i + 1; j < nums.length; j++){
                int secondNum = nums[j];
                if(firstNum + secondNum == target){
                    return new int[] {firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }
    // Approach 2: Use Hashtable to improve the time complexity, but it will be Space Complexity of O(n). Traverse through array and store each element in a hashtable.
    // target Sum = 6
    // currentNum = x
    // x + y = 10 , y = 10 - x
    // If y is in the hashtable (access with  O(1) time), return x and y
    // else keep traversing the array
    // nums [3, 2, 4], target = 6
    // y = 6 - 3 = 3 , is 3 in the hashtable, no , therefore store 3 in the hashtable
    // y = 6 - 2 = 4 , is 4 in the hashtable , no therefore store 2 in the hashtable
    // y = 6 - 4 = 2 , is 2 in the hashtable, Yes! Bingo.
    // Therefore two sum is {2, 4}
    // Time O(n) (traverse the array only once), solving for y is a O(1) operation
    // Space O(n)

    public static int[] twoSum_Hashtable(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                result[0] = i;
                result[1] = map.get(difference);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    // Approach 3: Sort the array
    // nums = [2,7,11,15], target = 9
    // [2, 7, 11, 15] , quick sort or merge sort , so Time complexity is O(n logn)
    // O(1) space
    // left pointer - at index 0 => 2
    // right pointer - at last index 2 => 4
    // is (2 + 15) == 9,
    // is 17 == 9, no, since 17 > 9, move the right pointer down (to the one left position)
    // is (2 + 11) == 9, no, move the right pointer down (to the one left position)
    // is (2 + 7) == 9, yes!
    // depends on the sum result, move either the left pointer up or move the right pointer down
    // time complexity O(n logn) | Space complexity O(1)

    public static void twoSum_ConstantSpace(){

    }


}
