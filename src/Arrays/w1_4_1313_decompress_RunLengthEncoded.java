package Arrays;

/*
        1. Write a function to return sum of two numbers
        2. Given an array, find a given number whether it is present or not
            i/p = { 2, 3, 1, 5, 6}
            value = 1
            o/p true

            i/p = {2, 3, 1, 5, 6}
            value = 12
            o/p false
         3. Average of two integers
         4. Find minimum number in the given array
            i/P = { 2, 3, 1, 5, 6}
            o/P = {1,2}

            i/P = { 2, -3, 1, 5, 6}
            o/P = {-3,1}

            i/P = { 2, 2, 2, 2, 2}
            o/P = {2, 2}

            i/P = 2
            o/P = {2, INT_MAX}

            i/P = empty
            o/P = {INT_MAX, INT_MAX}


 */

import java.util.Arrays;
import java.util.Collection;

public class w1_4_1313_decompress_RunLengthEncoded {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 6};
        int[] arrayEmpty = {};
        int[] arrayMin = {2, -3, 1, 5, 6};
        int[] array1 = { 2, 2, 2, 2, 2};
        int[] array2 = {2};
//        System.out.println(sumOfTwoNums(2, 3));
//        System.out.println(sumOfTwoNums(2, -1));
//------------------------------------------------------
//        System.out.println(findGivenNumInArray(array, 1));
//        System.out.println(findGivenNumInArray(array, 12));
//        System.out.println(findGivenNumInArray(arrayEmpty, 1));
//------------------------------------------------------
//        System.out.printf( "%.2f", averageOfTwoNumbers(12.35, 34.34));
//------------------------------------------------------
//        System.out.println(minNumInArray(array));
//        System.out.println(minNumInArray(arrayMin));
//        System.out.println(minNumInArray(array1));
//------------------------------------------------------
//        System.out.println(minNumArray(arrayMin));
//        System.out.println(minNumArray(array1));
//        System.out.println(minNumArray(array2));
//        System.out.println(minNumArray(arrayEmpty));
//------------------------------------------------------
//        printArray(bubbleSort(arrayMin));
//------------------------------------------------------
        testMapToInt();

    }

    private static int sumOfTwoNums(int a, int b){
        return a + b;
    }
    //------------------------------------------------------
    private static boolean findGivenNumInArray(int[] array, int value){
        for(int i = 0 ; i < array.length; i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;
    }
    //------------------------------------------------------
    private static double averageOfTwoNumbers(double a, double b){
        return (a + b)/2 ;
    }
    //------------------------------------------------------
    private static int minNumInArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    //------------------------------------------------------

    private static int[] minNumArray(int[] array){
        int smallestMin = array[0];
        int secondSmallestMin = array[0];
        int[] smallestArray = {smallestMin, secondSmallestMin};
        return smallestArray;
    }

    //------------------------------------------------------

    // bubble sort array
    private static int[] bubbleSort(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void testMapToInt() {
        System.out.println();
        System.out.println("Test mapToInt start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Delete first char of element and returns number
        int[] number = collection.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println("number = " + Arrays.toString(number)); // print  number = [1, 2, 3, 1]
    }
}
