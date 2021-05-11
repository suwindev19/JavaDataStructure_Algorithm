package greedy;

public class G1_MinCoins {
    public static void main(String[] args) {
        int[] coins = {5, 10, 2, 1, 3, 4, 6};
        int N = coins.length;
        int amount = 57;
        // Sort the array in descending order
        for(int i = 1; i < N; i++){
            int temp = coins[i];
            int j = i -1;
            while(j >= 0 && temp> coins[j]){
                coins[j+1] = coins[j];
                coins[j] = temp;
                j--;
            }
        }
        int result = 0;
        for(int i = 0; i < N; i++){
            if (coins[i] <= amount){
                int c = (amount/coins[i]);
                result += c;
                amount = amount - (c * coins[i]);
            }
            if (amount == 0){
                break;
            }
        }
        System.out.println(result);
    }
}
