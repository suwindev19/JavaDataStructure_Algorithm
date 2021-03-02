package array;

public class A_26_EquilibriumPoint {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 8, -9, 20, 6};
        System.out.println(hasEquilibriumPoint(nums,4));
        System.out.println(hasEquilibriumPoint_Efficient(nums));
    }

    //
    public static boolean hasEquilibriumPoint(int[] nums, int e){
        int left_sum = 0;
        for(int i = 0; i < e; i++){
            left_sum += nums[i];
        }
        System.out.println(left_sum);
        int right_sum = 0;
        for(int j = e+1; j < nums.length;j++){
            right_sum += nums[j];
        }
        System.out.println(right_sum);
        if(left_sum == right_sum)
            return true;
        else
            return false;
    }
    //              3, 4, 8, -9, 20, 6       n = 6
    /*
    sum = 26
    left_sum = 26
    i = 4                        ^


     */
    public static boolean hasEquilibriumPoint_Efficient(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }


        int left_sum = 0;
        for(int i=0; i < nums.length; i++){
            if(left_sum == sum - nums[i]){
                return true;
            }
            left_sum += nums[i];
            sum -= nums[i];
        }
        return false;
    }
}
