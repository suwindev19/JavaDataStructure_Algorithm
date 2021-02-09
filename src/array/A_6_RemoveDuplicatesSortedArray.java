package array;

import java.util.ArrayList;

/*
input: arr[] = {10, 20, 20, 30, 30, 30, 30}
size = 7

 */
public class A_6_RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        removeDuplicatesSortedArray_1(arr);
    }

    // Time Theta(n) + O(n)
    // Space Theta(n)
    private static int removeDuplicatedsSortedArray(int[] arr){
        int arraySize = arr.length -1;
        int temp[] = new int[arraySize];
        temp[0] = arr[0];
        int result =1;
        for(int i = 1; i < arraySize; i++){
            if(temp[result -1] != arr[i]){
                temp[result] = arr[i];
                result++;
            }
        }

        for(int i = 0; i < result; i++){
            arr[i] = temp[i];
        }
        return result;
    }

    private static void removeDuplicatesSortedArray_1(int[] arr){
        int result = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] != arr[result-1]){
                arr[result] = arr[i];
                result++;
            }
        }
        System.out.println(result);

    }
}
