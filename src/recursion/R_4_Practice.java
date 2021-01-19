package recursion;
// will get the floor of [log2 n]
// Floor of base of 2
public class R_4_Practice {
    public static void main(String[] args) {
//        System.out.println(fun(16));
        fun2(7);
        System.out.println();
        fun2(13);
    }
    static int fun(int n){
        if(n==1){
            return 0;
        }else{
            return 1 + fun(n/2);
        }
    }
    // will get the floor of [log3 n]
    static int fun1(int n){
        if(n < 3){
            return 0;
        }else{
            return 1 + fun1(n/3);
        }
    }

    // decimal to binary conversion
    static void fun2(int n){
        if(n == 0)
            return;
        fun2(n/2);
        System.out.print(n% 2 + " ");
    }
}
