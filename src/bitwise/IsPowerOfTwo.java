package bitwise;

public class IsPowerOfTwo {
    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo_Naive(6));
//        System.out.println(isPowerOfTwo_Naive(4));
        System.out.println(isPowerOfTwo_BrianKerningam(6));
        System.out.println(isPowerOfTwo_BrianKerningam(4));
    }

    static boolean isPowerOfTwo_Naive(int n){
        if(n == 0) return false;
        while(n != 1){
            if(n % 2 !=0)
                return false;
            n = n/2;
        }
        return true;
    }

    static boolean isPowerOfTwo_BrianKerningam(int n){
        return (n != 0 && (n & (n-1)) == 0);
    }
}
