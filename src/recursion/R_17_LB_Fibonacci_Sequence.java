package recursion;

public class R_17_LB_Fibonacci_Sequence {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n){
        if (n == 0 ) return 0;
        if (n== 1 || n==2) {
            return 1;
        }
        else
           return fibonacci(n -1) + fibonacci(n-2);
    }
}
