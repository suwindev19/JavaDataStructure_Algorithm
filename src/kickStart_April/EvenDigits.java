package kickStart_April;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {

    }
    public static boolean countOddNumber ( int N){
        int oddCount = 0;
        int i = 0;
        // Change given number to integer array
        while (N != 0) {
            int x = N % 10;
            if (x % 2 !=0){
                oddCount++;
                break;
            }
            N = N / 10;
            i++;
        }
        if (oddCount % 2 == 0)
            return true;
        return false;
    }

    public static char[] convertIntegerToCharArray(int N) {
        int len = Integer.toString(N).length();
        char[] array = new char[len];
//        for(int i = 0; N !=0; N /=10){
//            array[len-i-1] = N % 10;
//
//
//        }
    return array;
    }

    public static int increasedN(int N) {
        int I= 0;
        // Convert N into array digits
        int len = Integer.toString(N).length();
        int[] array = new int[len];
        int i = 0;
        while (N != 0) {
            array[len - i - 1] = N % 10;
            N = N / 10;
        }
        return I;
    }

    public static int decreasedN(int N){
        int decreasedN = 0;
        return decreasedN;
    }
}

