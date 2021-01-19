package recursion;

public class R_7_tailRecursion {
    public static void main(String[] args) {
        fun1(4);
        System.out.println();
        fun2(4);
    }

    // print n to 1
    // Tail Recursion - recursive function when parent function has nothing more to do when the child function finish
    // Caller does not have to save it and does not resume the execution
    // Modern compiler does this.and change fun1 => n = n-1 then go to start internally
    // Therefore overhead auxillary requirement is eliminated. it is called Tail call elimination.
    static void fun1(int n){
        if(n==0)return;
        System.out.println(n);
        fun1(n-1);
    }


    // print 1 to n
    static void fun2(int n){
        if(n==0) return;
        fun2(n-1);
        System.out.println(n);
    }
}
