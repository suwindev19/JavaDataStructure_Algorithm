package sorting;

import java.util.Arrays;

/*
        Divide and conquer algorithm
        Recursively sort the two parts
        stable algorithm
        O(n log n)
        Not in place sorting algorithm => O(n) auxillary space
        Block mergesort
        Well suited for linked list , and works in O(1) space
        Used in external sorting, part of inputs
        In general for arrays, quicksort outperforms

 */
public class Merge_Sort_GFG {
    public static void main(String[] args) {
        int[] nums1 = { 5, 4, 3, 2, 1};
        int[] nums2 = {5, 6, 6, 15};

        printArray(mergeSort(nums1));


    }

    private static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static int[] mergeSort(int[] arr){
        // base case
        if(arr.length < 2) return arr;

        int midpoint = arr.length/2; // 3
        int[] left = new int[midpoint]; // 3
        int[] right;
        if(arr.length % 2 == 0) // 4/2 = 2
            right = new int[midpoint];
        else
            right = new int[midpoint+1];
        // populate left array
        for(int i = 0; i < midpoint; i++){
            left[i] = arr[i];
        }
        // populate right array
        for(int j = 0; j < right.length; j++){
            right[j] = arr[midpoint+j];
        }

        // new array that will have sorted array
        int[] result = new int[arr.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);

        return result;


    }

    private static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        // we now have something to merge
        while(i < left.length || j < right.length){
            if(i < left.length && j < right.length){
                if(left[i] < right[j]){
                    result[k++] = left[i++];
                }else {
                    result[k++] = right[j++];
                }
            }else if(i < left.length){
                result[k++] = left[i++];
            }else if(j < right.length){
                result[k++] = right[j++];
            }
        }
        return result;

    }

//    public static void mergeSort(int[] nums1, int[] nums2){
//        int len1 = nums1.length;
//        int len2 = nums2.length;
//        int[] nums3 = new int[len1 + len2];
//        for(int i = 0; i < len1; i++){
//            nums3[i] = nums1[i];
//        }
//
//        for(int i = 0; i < len2; i++){
//            nums3[len1 + i] = nums2[i];
//        }
//
//        Arrays.sort(nums3);
//        for(int i : nums3){
//            System.out.print(i+ " ");
//        }
//    }

//    public static int[] mergesort(int arr[]){
//        int len1 = arr.length;
//        if(len1 < 2) return arr; // base condition
//        int mid = len1/2;
//        int[] left = new int[mid];
//        int[] right = new int[len1 -mid];
//
//        for(int i = 0; i < mid-1;i++){
//            left[i] = arr[i];
//        }
//        for(int i = mid; i < len1 -mid; i++){
//            right[i-mid] = arr[i];
//        }
//        mergesort(left); // recursive call
//        mergesort(right); // recursive call
//        merge(left,right,arr);
//    }
//
//    public static int[] merge(int[] left, int[] right, int[] arr){
//        int len1 = left.length ;
//        int len2 = right.length;
//
//        int i = 0, j = 0, k = 0;
//        while(i < len1 && j & len2){
//            if(left[i] <= right[j]){
//                arr[k] = left[i];
//                i++;
//            }else{
//                arr[k] = right[j];
//                j++;
//            }
//            k++;
//        }
//
//    }
}































