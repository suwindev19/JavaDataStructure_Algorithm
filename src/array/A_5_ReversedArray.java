package array;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;

public class A_5_ReversedArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, -1};
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int n = arr.length;
        reverseArray(arr,n);
    }

    public static void reverseCharArray(char[] arr){
        int low = 0, high = arr.length-1;
        while(low < high){
            int temp = arr[0];
            
        }
    }

    // Time Theta(n)
    // Auxillary space Theta(1)
    public static void reverseArray(int[] arr, int n){
        int low = 0;
        int high = n-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        Iterator<Integer> i = Arrays.stream(arr).iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }
}
