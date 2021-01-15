package Arrays;

public class w1_6_189_rotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int[] rotated = rotateArray(array, d);
        for(int i = 0; i < array.length ; i++){
            System.out.print(rotated[i] + " ");
        }
    }
    // Approach 1
    // Time O(n)
    // Space O(n)
    private static int[] rotateArray(int[] nums, int k){
        int n = nums.length;
//        if(n <= 1 || k == 0 || k == n) return;
        if( k > n) k = k % n; // this is for edge case such as { 1, 2} , k = 3
        int[] temp = new int[k]; // Space O(n)

        // Add elements after k index into temp array
        // 1 2 3 4 5 6 7    array
        // 0 1 2 3 4 5 6    index
        // k = 3, n = 7
        for(int i = 0; i < k; i++){ // Time O(k)
            temp[i] = nums[n-k + i];
        }
        // 1 2 3 4 5 6 7    array
        // 0 1 2 3 4 5 6    index
        //       1 2 3 4    shifted array
        // Shift elements
        for(int i = n-1; i >= k; i--){ // 6 // Time O(n)
            nums[i] = nums[i-k]; // 6-3
        }

        // Add temp array elements into the original array
        for(int i = 0; i < k; i++){ // Time O(k)
            nums[i] = temp[i];
        }
        return nums;
    }
}
