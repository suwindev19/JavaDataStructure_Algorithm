package youTube;

public class lc_191_NumbersOfBits {
    public static void main(String[] args) {
//        int a = 32;
//        //
//        System.out.println(Integer.toBinaryString(a));
//        //
//        int b = -32;
//        System.out.println(Integer.toBinaryString(b));

        int c = 3;
        int mask = 1;
        // 0 0 1 1
        // 0 0 0 1
//
//        int d = -4 <<1;
//        // 11....100
//        int d1 = -4 >>>1;
//        System.out.println(Integer.toBinaryString(d));
//        System.out.println(Integer.toBinaryString(d1));
        int n = 11;
        System.out.println(bits(n));
    }

    public static int bits(int n){
        int count = 0;
        while(n !=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
