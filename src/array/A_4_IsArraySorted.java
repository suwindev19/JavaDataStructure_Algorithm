package array;

public class A_4_IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, -9, 30, 23};
        int[] arr1 = {1, 2, 3, 4};
        System.out.println(isSorted(arr));
        System.out.println(isSorted_Efficient(arr1));
    }

    // naive solution
    // Time O(n^2), Space O(1)
    private static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    // efficient
    // Time O(n)
    // for empty array, it will not even go into this for loop . array with single element, it will also not go into this for loop.
    private static boolean isSorted_Efficient(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
