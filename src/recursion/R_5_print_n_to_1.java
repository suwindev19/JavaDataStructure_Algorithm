package recursion;

// Input: n = 5;
// Output: 5 4 3 2 1

// Input: n = 2;
// Output: 2 1

public class R_5_print_n_to_1 {
    public static void main(String[] args) {
//        iterativePrint(5);
        recursivePrint(5);
    }

    public static void iterativePrint(int n){
        for(int i = n; i > 0; i--){
            System.out.print(i + " ");
        }
    }

    // Time(n) = T(n-1) + Theta(n)
    // Space call stack auxillary space Theta(n), this will be reduced to Theta(1) with tail recursion

    public static void recursivePrint(int n){
        if(n <=0)return;
        else{
            System.out.print(n +" " );
            recursivePrint(n-1);
        }

    }
}
