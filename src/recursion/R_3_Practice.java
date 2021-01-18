package recursion;

public class R_3_Practice {
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n-1);
        fun(n-1);
        System.out.println(n-1);
    }

    public static void main(String[] args) {
        fun(3);
        // 2
        //
    }
}
