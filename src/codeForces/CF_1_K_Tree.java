package codeForces;

import java.io.IOException;
import java.util.Scanner;
public class CF_1_K_Tree {
    // n = total weight
    // d = minimum edge weight
    // k = k tree and each vertex has k children
    static int n, k, d;
    static int MOD = (int) 1e9+7;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        d = sc.nextInt();
        n = 3;
        k = 3;
        d = 2;
        int sum =0;
        boolean flag = false;
        System.out.println(totalPath(sum, flag));
    }
    // flag is to indicate whether we have seen an edge value
    // which is equal to or greater than "d"
    public static int totalPath(int sum, boolean flag) {
        // base case
        if (sum == n && flag == true) {
            return 1;
        } else if (sum > n) {
            return 0;
        }
        int total = 0;
        for (int i = 1; i <= k; i++) {
            boolean dFlag = false;
            if (i >= d) {
                dFlag = true;
            }
            total += totalPath(sum +i, dFlag || flag);
        }
        return total;

    }

}







//    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    StringBuilder out = new StringBuilder();
//    StringTokenizer tk;
//    tk = new StringTokenizer(in.readLine());
//    n = java.lang.Integer.parseInt(tk.nextToken());
//    k = java.lang.Integer.parseInt(tk.nextToken());
//
//    dp = new int[n+1][2];
//        for(int i =0; i <=n; i++) {
//        Arrays.fill(dp[i], -1);
//    }
//        System.out.println(calculate(0,0));
//}
//
//    static int calculate(int sum, int x) {
//        if (sum == n && x == 1) return 1;
//
//        if(sum >= n) return 0;
//        if(dp[sum][x] != -1)
//            return dp[sum][x];
//
//        // (a + b) % MOD == (a % MOD)  + (b % MOD) % MOD
//        int ans =0;
//        for(int i =1; i <=k ; i++) {
//            ans = ((ans % MOD) + (calculate(sum+i, (x == 1 || i>=d ? 1 : 0))) %MOD) % MOD;
//        }
//        return dp[sum][x] = ans;
//    }