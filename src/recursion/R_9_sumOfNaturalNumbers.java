package recursion;

public class R_9_sumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNum_formula(4));
        System.out.println(sumOfNaturalNum_recursion(4));
    }

    static int sumOfNaturalNum_formula(int n){
        return (n * (n+1))/2;
    }
    // Time O(n+1) function call
    // T(n) = T(n-1) + Theta(1)
    // Auxillary space Theta(n)
    static int sumOfNaturalNum_recursion(int n){
        if(n == 0) return 0;
        return  n + sumOfNaturalNum_formula(n-1);
    }
}
