package array;

public class A_11_MaximumDifferenceProblem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
//        maximumDifferenceInArray_Efficient(arr);
//        generatePrimeNumbers(100);
        System.out.println(maxDifferenceTest(arr));
    }

    public static int maxDifferenceTest(int[] arr){
        int max = arr[1] - arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i] - min);
            min = Math.min(min, arr[i]);

        }
        return max;
    }

    // Theta(n^2)
    public static void maximumDifferenceInArray(int[] arr){
        int result = arr[1] - arr[0];
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr.length; j++){
                result = Math.max(result, (arr[j] - arr[i]));
            }
        }
        System.out.println(result);
    }

    public static void maximumDifferenceInArray_Efficient(int[] arr){
        int result = arr[1] - arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            result = Math.max(result, (arr[i] - min));
            min = Math.min(min, arr[i]);
        }
        System.out.println(result);
    }


    public static void generatePrimeNumbers(int n){
        int p;
        int i;
        int[] primes = new int[50];
        int primeIndex = 2;
        boolean isPrime;

        primes[0] = 2;
        primes[1] = 3;
        for(p = 5; p <=100; p +=2){
            isPrime = true;
            for(i = 1; isPrime && (p / primes[i]) >= primes[i]; i++ ){
                if(p % primes[i] == 0)
                isPrime = false;
            }
            if(isPrime == true){
                primes[primeIndex] = p;
                primeIndex++;
            }
        }
        for(i = 0; i < primeIndex; i++){
            System.out.print(primes[i] + " ");
        }


    }
}
