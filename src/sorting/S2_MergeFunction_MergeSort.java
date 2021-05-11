package sorting;
import java.math.*;
/*
int[] a = {10, 15, 20, 11, 30};
           low     mid     high
           Sorted     Sorted
           low    mid mid+1 high
           low <= mid < high
 */
public class S2_MergeFunction_MergeSort {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 11, 30};
        int low = 0, mid = 2, high = 4;
        int[] result = mergeSort_TwoSubArrays(a, low, mid, high);
        for(int i : result){
            System.out.print(i+ " ");
        }
    }
    // Theta (n) - Time
    public static int[] mergeSort_TwoSubArrays(int[] a, int low, int mid, int high){
        int n1 = mid - low +1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Setting up the auxillary array
        for(int i = 0; i < n1; i++){
            left[i] = a[i];
        }

        for(int i = 0; i < n2; i++){
            right[i] = a[n1+i];
        }
        // Merge Sort
        int i = 0, j =0, index =0;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                a[index] = left[i];
                i++;
                index++;
            } else{
                a[index] = right[j];
                index++;
                j++;
            }
        }

        while (i < n1){
            a[index] = left[i];
            index++;
            i++;
        }

        while (j < n2){
            a[index] = right[j];
            index++;
            j++;
        }

        return a;
    }
}
