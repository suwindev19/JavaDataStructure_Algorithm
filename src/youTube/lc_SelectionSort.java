package youTube;

import java.util.Arrays;

public class lc_SelectionSort {
    public static void main(String[] args) {
        int min, index;
        int[] a = { 10, 1, 5, 8, 7, 6, 4, 3, 2, 9};
        for(int i =0; i < a.length-1; i++){
            index = i; // index = 0
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[index]){
                    index = j;
                    System.out.println(index);
                }
            }

        }
    }
}
