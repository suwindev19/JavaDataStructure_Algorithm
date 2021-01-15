package mathsQuestions;

public class FindPrimes {
    public static void main(String[] args) {
//        System.out.println(findPrimes(1, 20));
//        System.out.println(countPrimes(20));
//        System.out.println(isPrime(5));
//        System.out.println(isPrime(25));
//        System.out.println(isPrime(43));

        int num = 10;
        sieveOfErathothnes(num);

    }

//    public static ArrayList<Integer> findPrimes(int start, int end){
//        ArrayList<Integer> primes = new ArrayList<Integer>();
//        for(int n = start; n < end; n++){
//            boolean prime = true;
//            for(int i = 2; i * i <= n; i++){
//                if(n % i == 0) prime = false;
//                break;
//            }
//            if(prime){
//                primes.add(n);
//            }
//        }
//
//        return primes;
//    }
//
//    public static int countPrimes(int num){
//        int count = 0;
//        ArrayList<Integer> primes = findPrimes(1,20);
//        return primes.size();
//    }

    //====================================
    public static boolean isPrime(int n){
        // For Math.sqrt(n), O sqrt(n)
        // For i * i <= n, Time O(n log(log n))
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)  return false;
        }
        return true;
    }

    //====================================
    // Time O(n)
    public static void sieveOfErathothnes(int n){
        boolean[] primes = new boolean[n]; // assume all the numbers are prime first
        for(int i = 0; i < n; i++)
            primes[i] = true;

        for(int i = 2; i * i < n; i++){
            if(primes[i] == true){
                for(int j = i; j * i < n; j++){
                    primes[i*j] = false;
                }
            }
        }
//        int primesCount = 0;
//        for(int i = 2; i < primes.length;i++){
//            if(isPrime(i)){
//                primesCount++;
//            }
//        }
//        return primesCount;

        for(int i = 2; i < primes.length; i++){
            if(primes[i] == true)
                System.out.print(i + " ");
        }
    }





}
