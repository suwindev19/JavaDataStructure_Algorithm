package youTube;

public class lc_322_CoinChange {
    public static void main(String[] args) {
        // Test 1
//        int[] coins = { 1, 2, 5};
//        int amount = 11;
        // Test 2 | Error StackOverFlowError , should get -1
        int[] coins = { 2};
        int amount = 3;
        // Test 3
//        int[] coins = { 1};
//        int amount = 0;

        // Test 4 | pass
//        int[] coins = { 1};
//        int amount = 1;
        // Test 5 | pass
//        int[] coins = { 1};
//        int amount = 2;

        System.out.println(coinChange(coins, amount));
    }

    // Time complexity O(numOfCoin * amount)
    // Space O(coins.length)
    private static int coinChange(int[] coins, int amount){
        // Base case
        if(amount == 0) return 0;
        int n = amount + 1; // Why add 1 to n? What is n?

        for(int coin = 0; coin < coins.length; coin++){
            int currentIndex = 0;
            // Filter the coin that is less than current value of amount
            if( coin <= amount){
                // why next?
                int next = coinChange(coins, amount - coin);
                if(next >= 0){
                    n = Math.min(n, next + 1);
                }
            }
            if(currentIndex > 0){
                n = Math.min(n, currentIndex);
            }
        }

        if(n == amount + 1)
            return -1;
        else
            return n;
    }
}

