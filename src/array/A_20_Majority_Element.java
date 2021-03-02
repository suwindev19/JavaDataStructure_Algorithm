package array;
/*
element occurs more than n/2
input int nums[ ] = {8, 3, 4, 8, 8}


 */
public class A_20_Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,3,3,2};
        System.out.println(majorityElement_BoyerMoreVoting(nums));
    }

    public static int majorityElement(int[] nums){

        int count = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count >  nums.length/2){
                return nums[i];
            }
        }

        return -1;
    }
    public static int majorityElement_BoyerMoreVoting(int[] nums){
        // Phase 1 : Find the candidate
        int result = 0, count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[result] == nums[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                result = i;
                count = 1;
            }
        }

        // Check if the candidate is actually a majority
        count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[result] == nums[i]){
                count++;
            }
        }
        if(count <= nums.length/2){
            result = -1;
        }
        return result;
    }
}
