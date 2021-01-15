package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n){
        if(n < 2) return n;
        int[] fibNums = new int[n+1];
        fibNums[1] = 1;
        for(int i = 2; i <= n; i++){
            fibNums[i] = fibNums[i-1] + fibNums[i-2];
        }
        return fibNums[n];
    }
}
