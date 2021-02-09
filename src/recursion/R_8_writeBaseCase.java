package recursion;

public class R_8_writeBaseCase {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 5 * 4 * 3 * 2 * 1 = 120
        System.out.println(fibonacciNum(5));

    }

    static int factorial(int n){
        // base case
        if(n == 0)return 1;
        return (n * factorial(n-1));
    }

    static int fibonacciNum(int n){
        // base case
        if(n == 0 ) return 0;
        if(n == 1)  return 1;
        // if(n <= 1) return n;
        return fibonacciNum(n-1) + fibonacciNum(n-2);
    }

}
