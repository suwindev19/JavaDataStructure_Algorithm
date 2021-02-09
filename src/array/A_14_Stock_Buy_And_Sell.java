package array;

public class A_14_Stock_Buy_And_Sell {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        int[] arr1= {30, 20, 10};
        System.out.println(maxProfit(arr1,arr1.length));
    }

    // every bottom price = buy it.
    // goes down, let it goes down
    // min -> buyt it again
    // goes up, buy again.
    public static int maxProfit(int[] price, int n){
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(price[i] > price[i-1]){
                profit = profit + (price[i] - price[i-1]);
            }
        }
        return profit;
    }
}
