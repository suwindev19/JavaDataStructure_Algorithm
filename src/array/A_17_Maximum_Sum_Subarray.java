package array;
/*

 */
public class A_17_Maximum_Sum_Subarray {
    public static void main(String[] args) {

    }

    public static int maxSumSubArray(int[] arr){
        int sum = arr[0];
        for(int i = 0; i < arr.length; i++){
            int currentSum = 0;
            for(int j = i; j < arr.length; j++){
                currentSum = currentSum + arr[i];
                sum = Math.max(currentSum, sum);
            }
        }

        return sum;
    }
}
