package array;

public class A_15_Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2, 5};
        int n = arr.length;
        System.out.println(getWater1(arr, n));
    }

    // Time Theta(n^2)
    public static int getWater(int[] arr, int n){
        int result = 0;
        // left most bar and right most bar, you can never store water, therefore,
        // start from i = 1 and n-1 to exclude left and right most bars
        for(int i = 1; i < n-1;i++){

            int leftMax = arr[i];
            for(int j = 0; j < i;j++){
                leftMax = Math.max(leftMax, arr[j]);
            }

            int rightMax = arr[i];
            for(int j = i+1;j<n;j++){
                rightMax = Math.max(rightMax, arr[j]);
            }

            result = result + (Math.min(leftMax, rightMax) - arr[i]);
        }
        return result;
    }

    // pre-compute left max and right max
    // Theta(n)
    public static int getWater1(int[] arr, int n) {
        int result = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = arr[0]; // 5
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]); // 0, 5 => 5
        }

        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i>= 0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]); // 2, 3 => 3
        }

        for(int i = 1; i < n-1; i++){
            result += (Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }
        return result;
    }
}
