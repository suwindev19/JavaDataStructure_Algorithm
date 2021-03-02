package array;

public class A_18_Maximum_Length_Even_Odd_Subarray {
    public static void main(String[] args) {
        int[] nums = {5, 10, 20, 6, 3, 8};
        System.out.println(maxLengthEvenOddSubArray(nums));
    }

    public static int maxLengthEvenOddSubArray(int[] nums){
        int result = 1;
        for(int i = 0; i < nums.length; i++){
            int currentResult = 1;
            for(int j = i+1; j < nums.length; j++){
                if((nums[j] % 2 == 0 && nums[j-1] %2 !=0) || (nums[j] % 2 != 0 && nums[j-1] % 2 == 0)){
                    currentResult++;
                }else{
                    break;
                }
            }
            result = Math.max(result, currentResult);
        }
        return result;
    }

    public static int maxLengthEvenOddSubArray_Efficient(int[] nums){
        int result = 1;
        int currentResult = 1;
        for(int i = 1; i < nums.length; i++){
            if((nums[i] % 2 == 0 && nums[i-1] % 2 != 0) || (nums[i] % 2 !=0 && nums[i-1] % 2 == 0)){
                currentResult++;
                result = Math.max(currentResult, result);
            }else{
                currentResult = 1;
            }
        }
        return result;
    }
}
