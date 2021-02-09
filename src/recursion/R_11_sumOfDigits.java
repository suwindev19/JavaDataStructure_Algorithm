package recursion;

public class R_11_sumOfDigits {
    public static void main(String[] args) {
//        System.out.println(sumOfDigits(38));
        System.out.println(sumOfDigits_Iterative(38));
        System.out.println(sumOfDigits_Recursive(38));
    }
    static int sumOfDigits(int n){
        if(n <= 9) return n;
        else{
            return sumOfDigits(n /10 + n%10);
        }
    }

    static int sumOfDigits_Recursive(int n){
        if(n <=9 ) return n;
        return sumOfDigits_Recursive(n%10 + n/10);
    }

    // less auxillary space Theta(1)
    static int sumOfDigits_Iterative(int n){
        while(n > 9){
            int sum = 0;
            while(n > 0){
                sum = sum + n %10;
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
}
