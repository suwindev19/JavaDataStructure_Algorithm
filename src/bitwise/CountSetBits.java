package bitwise;

public class CountSetBits {
    public static void main(String[] args) {
//        System.out.println(countSetBit_1(5));
//        System.out.println(countSetBit_2(7));
//        System.out.println(countSetBit_3(13));
//        System.out.println(countSetBit_BrianKerningam(13));
    }

    // Naive Solution
    // Time Complexity Theta (Total bits in n)
    // Count the last bit and increment the number and keep shifting
    static int countSetBit_1(int n) {
        int result = 0;
        while(n > 0){
            if(n/2 != 0){
                result ++;
            }
            n = n/2;
        }
        return result;
    }

    static int countSetBit_2(int n){
        int result = 0;
        while(n > 0){
            if((n&1) == 1){
                result++;
            }
            n = n >> 1;
        }
        return result;
    }

    static int countSetBit_3(int n){
        int result = 0;
        while(n > 0){
            result = result + (n & 1);
            n = n >> 1;
        }
        return  result;
    }

    // Brian Kerningam's Algorithm
    // Time complexity = Theta (Set Bit count, not the total bit count proportional)
    // If the number has only 2 set bits, the while loop will only run 2 times
    // n = 40;
    // Binary representation
    //   7 6 5 4      3 2 1 0
    //   0 0 1 0      1 0 0 0  => Binary Representation
    //   0 0 1 0      0 0 0 0  => After 1st Iteration
    //   0 0 0 0      0 0 0 0  => After 2nd Iteration

    static int countSetBit_BrianKerningam(int n){
        int result = 0;
        while(n > 0){

            //   0 0 1 0      1 0 0 0  => Binary Representation n = 40
            //   0 0 1 0      0 1 1 1  => n = 39
            //------------------------------------
            //   0 0 1 0      0 0 0 0  => n = (n & (n-1) , n = 32

            //   0 0 1 0      0 0 0 0  => n = (n & (n-1) , n = 32
            //   0 0 0 1      1 1 1 1  => n = (n & (n-1) , n = 31
            //------------------------------------
            //   0 0 0 0      0 0 0 0

            n = (n & (n-1));
            result ++;
        }
        return result;
    }

    // Lookup Table Method for 32 bit number
    // Time Complexity Theta (1)
    // n = 13
    // 0000 0000  0000 0000 0000 0000  0000 0000
    // -------     ------    ------     ------
    // 8 bits      8 bits    8 bits     8 bits

    // Preprocessing
    // 8 bits -> break down into 4 chunks
    // 0 - 2^7-1 = 255


//    int table[256];
//    static void initialise(){
//        table[0] = 0;
//        for(int i = 1; i < 256; i++){
//            table[i] = ( i & 1) + table[i/2];
//        }
//    }
    static int countSetBit_LookUpTable(int n){
        int result = 0;
        return result;
    }
}

