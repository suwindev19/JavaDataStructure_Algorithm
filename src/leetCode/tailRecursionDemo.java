package leetCode;

public class tailRecursionDemo {
    public static void main(String[] args) {
        fucntion1(3);
        System.out.println();
        function2(3);
    }

    static void fucntion1(int n){
        if(n == 0) return;
        System.out.print(n);
        fucntion1(n-1);
    }

    static void function2(int n){
        if(n == 0) return;
        function2(n-1);
        System.out.print(n);
    }
}
