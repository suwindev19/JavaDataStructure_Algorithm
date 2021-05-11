package lc_contest;

public class lc_5726_SignOfProductOfArray {
    public static void main(String[] args) {
        int[] nums= {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int product = 1;
        for (int i =0; i < nums.length; i++) {
            product *= nums[i];

        }

        int result = Integer.MAX_VALUE;
        if (product > 0) {
            result = 1;

        }
        if (product < 0) {
            result =-1;

        }
        if (product == 0) {
            result = 0;

        }

        return result;
    }
}
