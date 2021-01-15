package bitwise;

import java.lang.reflect.Array;

public class TwoOddAppearing {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        // input element minimum size is 2.
        twoOddAppearing(arr);
        System.out.println("Using XOR and improving Time complexity to n");
        twoOddAppearing_XOR(arr);
    }

    // Time Theta (n^2)
    static void twoOddAppearing(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void twoOddAppearing_XOR(int[] arr){
        int xor = 0, result1 = 0, result2 = 0;
        // Find xor for this array {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        // 3 2 => cancel out
        // 4 4 => cancel out
        // 5 1
        // 6 1
        // 7 2 => cancel out
        for(int i =0; i < arr.length;i++){
            xor = xor ^ arr[i];
        }
        // Find the right most set bit so that the numbers can be divided into two groups
        int rightMostSetBit = xor & (~(xor-1));
        for(int j = 0; j < arr.length; j++){
            if((arr[j] & rightMostSetBit) != 0){
                result1 = result1 ^ arr[j]; // odd group because the last set bit is 1
            }else{
                result2 = result2 ^ arr[j]; // even group because the last set bit is 0
            }
        }
        System.out.println(result1 + " " + result2);
    }
}
