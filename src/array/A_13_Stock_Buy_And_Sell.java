package array;

public class A_13_Stock_Buy_And_Sell {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12}; // profit, 1-5 = 4, 3-12 = 9, therefore 13
        int[] arr1= {30, 20, 10}; // 0 lower prices
        int[] arr2 = {10, 20, 30}; // Increasing order, therefore, maximum profit.
        int[] arr3 = {1, 5, 3, 1, 2, 8}; // 1-5 = 4 , 1-8 = 7,
        System.out.println(maxProfit(arr,0, arr.length-1));

    }

    public static int maxProfit(int[] price, int start, int end){
        if(end<=start) return 0;
        int profit = 0;
        for(int i = start; i < end; i++){
            for(int j = i+1; j <=end;j++){
                if(price[j] > price[i]){
                    int currProfit = price[j] - price[i] + maxProfit(price, start, i-1) + maxProfit(price, j+1, end);
                    profit = Math.max(profit, currProfit);

                }
            }
        }
        return profit;
    }
}
