package recursion;

public class R_3_Practice {
    public static void main(String[] args) {
        fun2(3);
//        fun1(3);
    }
    static void fun2(int n){
        if(n == 0)
            return;
        fun2(n-1);
        System.out.println(n);
        fun2(n-1);
    }

    static void fun1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n-1);
        fun1(n-1);
        System.out.println(n-1);
    }

}
