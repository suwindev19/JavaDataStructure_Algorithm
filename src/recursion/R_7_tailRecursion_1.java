package recursion;

public class R_7_tailRecursion_1 {
    public static void main(String[] args) {
//        fun(4, 1);
        System.out.println(factorial(4));
        System.out.println(factorialTailRecursive(4,1));
    }

    static void fun(int n, int k){
        if(n ==0)return;
        System.out.println(k);
        fun(n-1, k+1);
    }

    // this is not tail recursive
    static int factorial(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    // Tail recursive equivalent
    static int factorialTailRecursive(int n, int k){
        if(n == 0 || n == 1)
            return k;
        return factorialTailRecursive(n-1, k*n);
    }
}


