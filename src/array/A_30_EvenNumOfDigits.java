package array;

public class A_30_EvenNumOfDigits {
    public static void main(String[] args) {
        int nums[] = {7896};
        findNumbers(nums);
    }
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length;i++) {
            int count = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                System.out.println(nums[i]);
                count++;
            }
            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
