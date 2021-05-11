package sorting;

import java.util.Arrays;

/*

Merge Sort
------------
- Divide and Conquer algorithm
    - divide into two parts
- Stable sorting algorithm
- Time  : Theta (n log n)
- Space :  O(n) auxillary space
- Well suited for LinkedList
- Works in O(1) Space
- Used for external sorting - In general for arrays, quicksort outperforms mergesort
- Java 8 (uses both quicksort and mergesort )

Two sorted arrays
--------------------------------------------
input   : a[ ] = {10, 15, 20};
          b[ ] = {5, 6, 6, 15};
output  :  {5, 6, 6, 10, 15, 15, 20};
--------------------------------------------
input   : a[ ] = {1, 1, 2}
          b[ ] = {3}
output  : {1, 1, 2, 3}
--------------------------------------------

Efficient Solution idea
-----------------------
a[ ] = {10, 20, 35}
b[ ] = {5, 50, 30}
initially i =0, j = 0
    if a[i] <= b[j] --> do something
    else --> do something

    5   j =1
    10  i =1
    20  i = 2
    35  i = 3


 */
public class S1_MergeSort {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 20};
        int[] b = {1, 12};
        int aLen = a.length;
        int bLen = b.length;
//        mergeSort_Naive(a,b, aLen, bLen);
        mergeSort_Efficient(a,b);

    }


    // Naive Approach
    // Time (O(m+n) * Log (m+n))
    // Space Theta(m+n)
    public static void mergeSort_Naive(int[] a, int[] b, int aLen, int bLen){
        int[] result = new int[aLen + bLen];
        for(int i =0; i < aLen;i++){
            result[i] = a[i];
        }
        for(int i = 0; i < bLen;i++){
            result[aLen+i] = b[i];
        }
        Arrays.sort(result);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
    // Time Theta (m + n)
    // Space O(1)
    public static int[] mergeSort_Efficient(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int index = 0;
        int i = 0, j = 0;
        while (i < a.length && j < b.length){
                if (a[i] <= b[j]){
                    result[index] = a[i];
                    i++;
                    index++;

                } else{
                    result[index] = b[j];
                    j++;
                    index++;
                }

        }
        while (i < a.length){
            result[index] = a[i];
            i++;
            index++;
        }
        while (j < b.length){
            result[index] = b[j];
            j++;
            index++;
        }
        return result;
        }

}

