package array;

import java.util.ArrayList;

/**
 * Contaguous memory location
 * index 0      1       2       3       4
 * num   10     15      20      30      40
 * loca  x      x+y     x+2y    x+3y    x+4y
 *
 * Advantages
 * 1. Random access
 * 2. cache friendliness
 *
 * cache is memory closest to CPU
 * ideally, store in cache because it is fast
 *
 * Array Types
 * - fixed sized array
 * - dynamic sized array
 *
 * In java, array are all allocated in Heap.
 *
 * Dynamic sized array
 * c++ vector
 * java ArrayList
 * Python list
 *
 * Doubling the size
 * Dynamic Sized Array
 * - rich library functions
 * -
 */
public class A_1_ArrayTheories {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56};
//        System.out.println(search(arr, 3));
//        System.out.println(insert(arr,13, 10, 3));
        System.out.println(delete(arr, arr.length, 3));
    }

    private static int search(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    private static int insert(int[] arr, int x, int capacity, int position){
        if( arr.length == capacity) return arr.length;
        int index = position -1;
        for(int i = arr.length-1; i >=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = x;
        return (arr.length+1);
    }

    private static int delete(int[] arr, int n, int x){
        int i;
        for(i = 0; i < n; i++){
            if(arr[i] == x){
                break;
            }
        }
        if(i == n) // you don't find the element 
            return n;
        for(int j = i; j < n-1; j++){
            arr[j] = arr[j+1];
        }
        return n-1;
    }
}
