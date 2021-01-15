package mathsQuestions;

public class LC_201_CountPrimes {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(prime_sieve(n));
    }

    public static int prime_sieve(int n){
        boolean[] primes = new boolean[n];
//        for(int i = 0; i < primes.length; i++){
//            primes[i] = true;
//        }

        for(int i = 2; i * i < primes.length; i++){
            // all multiples of 2 are not primes, therefore, they are set to false
            if(!primes[i]){
                for(int j = i; j * i < primes.length; j++){
                    primes[i*j] = true;
                }
            }
        }
        int primeCount = 0;
        for(int i = 2; i < primes.length; i++){
            if(!primes[i]){
                primeCount++;
            }
        }
        return primeCount; // 2, 3, 5, 7, 11, 13, 17, 19
    }
}
