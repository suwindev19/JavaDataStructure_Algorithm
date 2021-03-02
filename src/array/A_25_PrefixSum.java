package array;

public class A_25_PrefixSum {
    public static void main(String[] args) {
        int[] nums = {2, 8, 3, 9, 6, 5, 4};
        int preComputed[] = prefixSumCalculate(nums);
        System.out.println(getSum(preComputed, 0, 2));
//        System.out.println(getSum(preComputed, 0, 1));
    }
    public static int[] prefixSumCalculate(int[] nums){
        // pre-compute prefixSum array
        // 0 to i at index i
        // {2, 8, 3, 9, 6, 5, 4};
//prefixSum{2,10,13, 22, 28, 33, 37} O(n) time
        int[] prefixSum = new int[nums.length];
        prefixSum[0]= nums[0];
        for(int i = 1; i < nums.length;i++ ){
            prefixSum[i] =  prefixSum[i-1] + nums[i] ;
            System.out.print(prefixSum[i] + " ");
        }
        return prefixSum;
    }
    // to answer all the queries in O(1)
    // prefixSum[right] - prefixSum[left]
    // need to handle when prefixSum[left] is 0;
    public static int getSum(int[] preComputed, int left, int right){
        if(left !=0){
           return preComputed[right] - preComputed[left-1];
        }else{
            return preComputed[right];
        }
    }
}
