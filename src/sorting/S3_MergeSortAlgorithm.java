package sorting;

public class S3_MergeSortAlgorithm {
    public static void main(String[] args){
        int[] nums = {5,2,3,1};
        int[] result = sortArray(nums);
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    public static int[] sortArray(int[] nums){
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }

    public static void mergeSort(int[] nums, int start, int end){
        // edge case
        if (end - start + 1 < 2) return;
        int mid = start + (end - start)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end){
        int[] result = new int[end - start+1]; // why not int[n] , if I do that, it takes significantly higher time
        int index = 0;
        int i = start;
        int j = mid + 1;
        // why i <= mid
        while ( i <= mid && j <= end){
            if (nums[i] < nums[j]){
                result[index++] = nums[i++];
            } else{
                result[index++] = nums[j++];
            }
        }
        while ( i <= mid){
            result[index++] = nums[i++];
        }

        while(j <= end){
            result[index++] = nums[j++];
        }

        for(i = start; i <= end; i++){
            nums[i] = result[i - start];
        }

    }
}

/*
    public static void main(String[] args) {
        int[] nums = {10, 5, 30, 15, 7};
        int left = nums[0];
        int right = nums[nums.length-1];
        mergeSort(nums, left, right);
    }

    public static void mergeSort(int[] nums, int left, int right){
        // edge case check - at least two elements must be in the nums
        if (right > left){
            // this is to avoid overflow
            // (left + right)/2 - if left and right are high, there will be overflow
            // 0 + 900000000 /2
            // 0 + (900000000 - 0)/2
            int mid = left + (right - left)/2;
            // recursively solve left side
            mergeSort(nums, left, mid);
            // recursively solve right side
            merge(nums, left, mid, right);
//            mergeSort(nums, left, mid, right);
        }
    }

    // Analysis of Merge Sort Algorithm
    public static void merge(int[] nums, int left, int mid, int right){
    int n1 = mid - left +1;
    int n2 = right - mid;
    int[] leftN1 = new int[n1];
    int[] rightN2 = new int[n2];
    int i = 0, j = 0, index = 0;
    while (i < n1 && j < n2){
        if (nums[i] <= nums[j]){

        }
    }
}

 */
    /*

     */
