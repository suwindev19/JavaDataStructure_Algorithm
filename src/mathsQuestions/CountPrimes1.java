package mathsQuestions;
// Approach 1
// Brute force
// Time O(n)^2
// Check all the numbers below the give number
// if they divide the given number, they are not prime

public class CountPrimes1 {
    public static void main(String[] args) {
        int num = 10;
        CountPrimes1 countPrimes = new CountPrimes1();
        System.out.println(countPrimes(num));

    }

    public static int countPrimes(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (isPrimeI(i)) {
                count++;
            }
        }
        return count;
    }

    // Factors of 12
    // 2 x 6 = 12
    // 3 x 4 = 12
    // 4 x 3 = 12   //It is not necessary
    // 6 x 2 = 12   //It is not necessary
    // Therefore consider factors up to sqrt(n) because if n is divisible by some number p
    // n = p x q
    // p <= q
    // p <= sqrt(n)

    public static boolean isPrimeSquareRoot(int num) {
        int start = 2;
        int root = (int) Math.sqrt(num);
        while (start <= root) {
            if (num % start == 0) {
                return false;
            }
            start++;
        }
        return true;
    }

    // Approach 2
   // n(log(log n))
    public static boolean isPrimeI(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
