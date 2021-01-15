package mathsQuestions;

import java.util.Scanner;

public class CountPrimes3 {
    public static void main(String[] args) {
//        int n = 10;
//        System.out.println(countPrimes(n));

        //------------------------------------
        // get input from user
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prime number ceiling : ");
        n = sc.nextInt();
        sc.close();

        // initialise numbers array, where true denote primality
        boolean[] isPrime = new boolean[n];
        isPrime[0] = false; // 1 is not prime. Therefore it is false.
        // initialise all values to true first
        for(int i = 1; i < n; i++){
            isPrime[i] = true;
        }

        // check every number >= 2 for primality
        for(int j = 2; j <= n; j++){
            // j is prime if it has not been crossed off yet
            // Therefore check whether it has been crossed off
            //if(isPrime[j-1] == true){
            if(isPrime[j-1]){
                System.out.println(j);
                // cross out subsequent multiples
                // this is the sieving part
//                for(int k = 2 * j; k <= n; k += j){ // to make this more efficient
                for(int k = j * j; k <= n; k += j){
                    isPrime[k-1] = false; // crossing off
                }
            }
        }
    }

//    public static int countPrimes(int n){
//        boolean[] isPrime = new boolean[n];
//        for(int i = 2; i < n; i++){
//            isPrime[i] = true;
//        }
//
//        for(int i = 2; i * i < n ; i++){
//            if( !isPrime[i]) continue;
//            for(int j = i * i; j < n; j+= i){
//                isPrime[j] = false;
//            }
//        }
//        int count = 0;
//        for(int i = 2; i < n; i++){
//            if(isPrime[i]) count ++;
//        }
//        return count;
//    }
}
