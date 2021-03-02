package Searching;
/*
Selection Sort
Select one one value and compare with the rest and get the
    5 <- i pointer i fixed
    4 <- j
    1
    3
    2


    4 <- i pointer i fixed
    5
    1 <- j
    3
    2

    1 <- i pointer i fixed
    5
    4 <- j
    3
    2


 */
public class L_2_Sorting {
    public static void main(String[] args) {
        int[] nums = {5, 4, 6, 7, 2, 1};
        selectionSort(nums);
    }

    public static int[] selectionSort(int[] nums){
        for(int i = 0; i < nums.length; i ++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        return nums;
    }
}
