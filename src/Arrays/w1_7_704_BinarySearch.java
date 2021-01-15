package Arrays;

public class w1_7_704_BinarySearch {
    public static void main(String[] args) {
        int[] arr= {-1,0,3,5,9,12};
        System.out.println(binarySearch(arr, 9));
    }

    // Iterative approach
    // Time O(n)
    // Space O(1)
    private static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            if(target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
