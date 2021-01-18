package recursion;

class Test{
    static void fun1(){
        System.out.println("func1");
    }
    static void fun2(){
        System.out.println("Before fun1");
        fun1();
        System.out.println("After fun1");
    }
}

public class R_1_Intro {
    public static void main(String[] args) {
        System.out.println("Before fun2");
        Test.fun2();
        System.out.println("After fun2");

        // Guess output
        // Before fun2
        // Before fun1
        // func1
        // After fun1
        // After fun2
    }
}
