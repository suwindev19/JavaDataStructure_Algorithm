package hashing;
/*
Two sum problem. (Subset of sum problem)
- Find all the pairs of two integers in an unsorted array of integers that sum up to a given sum
-  int[] nums = [1, 2, 3, 4], sum = 5
   Answer : [1, 4]
            [2, 3]
   Use DP to reduce the running time to O(n) linear time
 */

import org.hamcrest.core.IsNull;

import java.util.ArrayList;
import java.util.List;

public class H13_TwoSumNaive {

    private  int[] nums;
    private  int S;

    public H13_TwoSumNaive(int[] nums, int S){
        this.nums = nums;
        this.S = S;
    }

    // O(n
    public static void twoSumNaive(int[] nums, int S){
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length;j++){
                if (nums[i]+ nums[j] == S){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    System.out.println(nums[i] + " "+ nums[j]);
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] nums = { 3, 5, -8, 9, -1, 0};
        int S = 8;
        twoSumNaive(nums, S);
    }

}


