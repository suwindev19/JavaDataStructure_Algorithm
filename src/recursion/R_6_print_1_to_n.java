package recursion;

public class R_6_print_1_to_n {
    public static void main(String[] args) {
        recursivePrint(4);
    }
    // Time Theta(n + 1)
    // T(n) = T(n-1) + Theta(1)
    // Space Auxillary N + 1 function call at any moment
    static void recursivePrint(int n){
        if(n <=0)return;
        else{

            recursivePrint(n-1);
            System.out.print(n +" " );
        }
    }
}
