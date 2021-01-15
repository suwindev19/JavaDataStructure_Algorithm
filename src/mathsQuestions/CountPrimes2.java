package mathsQuestions;

public class CountPrimes2 {
    public static void main(String[] args) {
        int num = 10;
        CountPrimes2 countPrimes = new CountPrimes2();
        System.out.println(countPrimes(num));

    }

    public static int countPrimes(int num){
        int count = 0;
        for(int i = 2; i < num; i++){
            if(isPrimeI(i)){
                count++;
            }
        }
        return count;
    }

    // Approach 2
    // i * i 
    public static boolean isPrimeI(int num){
        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
