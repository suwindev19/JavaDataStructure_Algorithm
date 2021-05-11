package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 8, 7, 3};
        insertionSort(nums);
        for(int i : nums){
            System.out.println(i);
        }
    }

    public static int[] bubbleSort(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] selectionSort(int[] nums){
        for(int i =0; i < nums.length-1 ;i++){
            for(int j = i +1; j < nums.length ;j++){
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] insertionSort(int[] nums){
        int n = nums.length;
        for(int i =1; i < n; i++){
            for(int j = i-i; j < i;j++){
                if (nums[j]> nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}
