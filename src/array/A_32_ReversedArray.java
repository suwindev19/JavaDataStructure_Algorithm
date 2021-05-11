package array;

public class A_32_ReversedArray {
    public static int[] reverseArray(int[] nums){

        int end = nums.length-1;
        for(int start = 0; start < nums.length/2; start++){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverseArray(nums);
        for(int i : nums){
            System.out.println(i);
        }
    }

}
