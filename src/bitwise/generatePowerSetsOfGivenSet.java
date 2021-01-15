package bitwise;

public class generatePowerSetsOfGivenSet {
    public static void main(String[] args) {
        String str = "abc";
        generatePowerSetOfGivenSet(str);
    }

    /*
    String str = "abc";
    length = 3
    powerSize = 2^3 = 8 -1 = 7
    Decimal (counter) | Binary (counter)    |   set
                            c b a
   --------------------------------------------------
    0                       0 0 0               ""
    1                       0 0 1               "a"
    2                       0 1 0               "b"
    3                       0 1 1               "ab"
    4                       1 0 0               "c"
    5                       1 0 1               "ac"
    6                       1 1 0               "bc"
    7                       1 1 1               "abc"


     */

    static void generatePowerSetOfGivenSet(String str){
        int n = str.length();
        int powerSize = (int)Math.pow(2, n);
        for(int decimalCounter = 0; decimalCounter< powerSize; decimalCounter++){
            for(int j = 0; j < n; j++){
                if((decimalCounter & (1 << j)) !=0){ // 0 0 0 & 0 0 0
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
