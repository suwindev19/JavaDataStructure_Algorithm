package sorting;
/*
    - O(n^2)
    - In place and stable
    - used in practice for small arrays
    - preferred in smaller arrays sorting
    - O(n) in best case
 */
public class Insertion_Sort_GFG {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2, 18};
        insertion_Sort(arr);
    }
    public static void insertion_Sort(int[] nums){
//        for(int i = 1; i < nums.length; i++){
//            for(int j = i - i; j < i; j++){
//                if(nums[i] < nums[j]){
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }

        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j --;
            }
            nums[j+1] = key;
        }

        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
