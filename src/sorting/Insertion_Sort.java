package sorting;
/*
key = nums[i]

while (j >- 0 && nums[j] > key{

 nums[j+1] = nums[j];
 j = j-1

 nums[j+1] = key
 */
public class Insertion_Sort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1, 0};
        insertionSort(nums);
    }

    public static void insertionSort(int[] nums){
        for(int i = 0; i < nums.length ; i++){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j -= 1;
            }
            nums[j+1] = key;
        }

        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
