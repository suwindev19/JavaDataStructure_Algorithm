package bitwise;

public class Bitwise_AND_OR {
    public static void main(String[] args) {
        int x = 2, y = 6;
        // Bitwise OR operator
//        System.out.println(x & y);
//        System.out.println(x | y);
//        System.out.println(x ^ y);
//        System.out.println(~x);
//        int a = -10;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(a<<1);

//        int a = 5;
//        System.out.println(~a);
//        int b = -2;
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println(Integer.toBinaryString(~b));

//        kthBitRightShift(13, 3);
//        kthBitLeftShift(13,3);

    }

    // right shift
    static void kthBitRightShift(int n, int k){
        if(((n>>(k-1)) & 1) == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static void kthBitLeftShift(int n, int k){
        if(n<<(k-1) != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    // count set bits in an Integer
    // n = 5
    // 0000 0101

}
