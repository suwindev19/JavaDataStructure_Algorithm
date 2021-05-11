package slidingWindow;

public class sw_1_MaxSumSubArray {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k = 3;
        System.out.println(findMaxSumSubArray(array, k));
    }

    public static int findMaxSumSubArray(int[] array, int k){
        int max = Integer.MIN_VALUE;
        int currentRunningSum =0;
        for(int i =0; i < array.length;i++){
            currentRunningSum += array[i];
            if (i >=k -1){
                max = Math.max(currentRunningSum, max);
                currentRunningSum -= array[i-(k-1)];
            }
        }
        return max;
    }
}
