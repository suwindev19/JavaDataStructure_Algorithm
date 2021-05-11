package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class lc_238_product_of_array_except_self {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        System.out.println(productExceptSelf(nums));
        System.out.println(productExceptSelf_Left_Right(nums));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }
        return answer;
    }

    public static int[] productExceptSelf_Left_Right(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] product = new int[nums.length];
        // [1, 2, 3, 4]
        left[0] = 1;
        for (int i = 1; i < nums.length;i++) {
            left[i] = left[i-1] * nums[i-1];
            System.out.println("Left " + left[i]);
        }

        right[nums.length-1] = 1;
        for(int i = nums.length-2; i>=0;i--) {
            right[i] = right[i+1]*nums[i+1];
            System.out.println("Right " + right[i]);
        }

        for (int i = 0; i < product.length; i++) {
            product[i] = left[i] * right[i];
            System.out.println(left[i]);
            System.out.println(right[i]);
            System.out.println(product[i]);
        }
        return product;
    }

    public static int[] prodcutExceptSelf_Time_Limit_Exceeded(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[0] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }
}
