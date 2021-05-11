package codeForces;

import java.util.Scanner;
//            System.out.println( ()+ (100 * i)  + (10 * i) + i);
public class CF_B_OrdinaryNumbers_Optimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            long n = sc.nextInt();
            System.out.println(countOrdinary(n));
        }
    }
    // 1, 2, 3, 4, 5, 6, 7, 8, 9
    // Either hard code or generate them
    // 11, 22, 33
    // 111, 222, 333,
    // 1111
    /*
   ( 1000 * i )+ ( 100 * i )+ ( 10 * i )+ i
   10^i,
    Count is to get 1, 2, ...9, 11, 22, ...,
    counter 1- 9
    i       1 -9
    j       1 - 9
    sum = 10
     */
    // Time  O(1) - only goes up to 10
    // Space O(1)
    public static long countOrdinary(long n){
        long result = 0;
        for(int counter = 1; counter <= 9 ; counter++){
            for(int i = 1; i < 10; i++){
                int sum = 0;
                for(int j = 0; j < counter; j++){
                    sum += Math.pow(10, j) * i;
                }
                if (sum <= n){
                    result++;
                } else{
                    return result; // it will check up to 99999999, therefore , optimise the algorithm
                }
            }
        }
        return result;
    }
}
