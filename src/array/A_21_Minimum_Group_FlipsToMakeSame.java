package array;

public class A_21_Minimum_Group_FlipsToMakeSame {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 0, 1};
//        System.out.println(minGroupFlipsToMakeSame(nums));
        int a = 2;
        a = a >> 1;
        System.out.println(a);
    }

    public static int minGroupFlipsToMakeSame(int[] nums){
        int count1 = 1, count0 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count1 ++;
            }else if(nums[i] == 0){
                count0 ++;
            }
            if(count1 > count0){
                return count0;
            }else{
                return count1;
            }
        }
        return -1;
    }
}
