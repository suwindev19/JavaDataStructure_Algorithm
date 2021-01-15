package mathsQuestions;

public class LC_42_TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3,0,2,0,4};
        int n = arr.length;
        System.out.println(calculateTrappedRainWater(arr, n));
    }

    // Approach 1
    // Time O(n^2) | Space O(1)
    public static int calculateTrappedRainWater(int[] arr, int n){
        int trappedWater = 0;
        // Ignore first and last index because you cannot have water trapped at both ends.
        // Therefore i index starts from 1 and i < arr.length
        for(int i = 0; i < arr.length -1; i++){  // Time O(n)

            // Find maximum value on left
            int left_max = arr[i];
            for(int j = 0; j < i; j++){         // Time O(n)
                left_max = Math.max(left_max, arr[j]);
            }

            // Find maximum value on right
            int right_max = arr[i];
            for(int j = i+1; j < n; j++){       // Time O(n)
                right_max = Math.max(right_max, arr[j]);
            }

            // Calculate trapped water
            trappedWater = trappedWater + Math.min(left_max, right_max) - arr[i];
        }
        return trappedWater;
    }

    // Approach 2
    // How can we find right_max and left_max with O(1)
    //


}
