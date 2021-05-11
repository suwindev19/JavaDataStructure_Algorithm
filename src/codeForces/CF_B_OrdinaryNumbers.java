package codeForces;

import java.util.Scanner;
/*
 // http://codeforces.com/problemset/problem/1520/B
 */

public class CF_B_OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            long n = sc.nextInt();
            System.out.println(countOrdinary(n));
        }
    }

    private static long countOrdinary(long n) {
        long count = 0;
        for(int i = 1; i <= n; i++){
            if (isOrdinary(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean isOrdinary(int i) {
        if ( i < 10){
            return true;
        }
//        boolean flag = true; // assume that number is ordinary, find something to prove it wrong
        // Finding two pairs which do not match is easier than finding all the pairs that match.
        int temp = i;
        while (temp >= 10){
            int remainder1 = temp % 10;
            temp /= 10;
            int remainder2 = temp % 10;
            // one pair of digit does not match
            if ( remainder1 != remainder2) {
                return false;
            }
        }
        return true;
    }
}

/*
boolean flag = true; // assume that number is ordinary, find something to prove it wrong
            // Finding two pairs which do not match is easier than finding all the pairs that match.
            int temp = i;
            while (temp >= 10){
                int remainder1 = temp % 10;
                temp /= 10;
                int remainder2 = temp % 10;
                // one pair of digit does not match
                if ( remainder1 != remainder2) {
                    flag = false;
                    break;
                }
            }
            // flag could be either true or false
            if (flag == true){
                count++;
            }
 */