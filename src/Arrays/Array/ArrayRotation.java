package Arrays.Array;

public class ArrayRotation {
    // rotate the elements
    /*
    int[ ] arr = {1 2 3 4 5 6 7};
    n = 7
    d = 2 ( 2 elements)
    original array      : 1 2 3 4 5 6 7
    rotated array by 1  : 2 3 4 5 6 7 1
    rotated array by 2  : 3 4 5 6 7 1 2
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;
        int d = 3;


//        rotateArray_1(array,d);
//        int[] result = rotateArray_2(array, d);
//        for(int i = 0; i < array.length; i++){
//            System.out.print(result[i] + " ");

        //--------------------------------
        rotateArray_3(array, d);
        printArray(array);

        }

    // Method 1
    // Use temporary array
    // Time O(n)
    // Space O(n)
    private static int[] rotateArray_1(int[] arr, int d){

        int[] tempArray = new int[d];
        // copy the first two elements into the temp array.
        for(int i = 0; i < d; i++){ // 1 2 3 4 5
            tempArray[i] = arr[i];  // 0 = 1
                                    // 1 = 2
        }
        // rotate by 1 to the left in the original array
        for(int i = 0; i < arr.length -d;i++){ // 1 2 3 4 5
            arr[i] = arr[i+d];                  // 1 = 3
        } // end: you get 3 4 5

        // insert tempArray elements into the original array
        // this is not working,
        for(int i = 0; i < d; i++){
            arr[i+ arr.length -d] = tempArray[i];
        }

        return arr;
    }

    // Method 2
    //-------------------
    // Rotate the element 1 by 1 d times.
    // arr = 1 2 3 4 5, d = 2
    // 1st rotation : Shift all the elements to the left side. Store element at index 0 in temp and insert it to the last index. 2 3 4 5 1
    // 2nd rotation : 3 4 5 1 2
    // Time O(n * d)
    // Space O(1)
    private static int[] rotateArray_2(int[] arr, int d){
        // rotate array 1 by 1 d times
        for(int i = 0; i < d; i++){ // O(d)
            // rotate by each element
            int temp = arr[0];
            for(int j = 0; j < arr.length -1; j++){ // reason for arr.length -1 is we need to shift only up to that index because we are shifting one by one and we store the first element into the last with temp. // O(n)
                arr[j] = arr[j+1];
            }
            arr[arr.length -1] = temp;
        }
        return arr;
    }

    // Method 3
    // Time O(n)
    // Space O(1)
    //---------------------
    // 1 2 3 4 5
    // reverse the first d element              2 1 3 4 5   O(d) +
    // reverse n - d elements   = 5 - 2 = 3     2 1 5 4 3   O(n-d) +
    // reverse n                                3 4 5 1 2   O(n)
    // https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
    private static void rotateArray_3(int[] arr, int d){
        // function to left rotate arr[] of size n by d
        if(d == 0) return;
        int n = arr.length;
        // if rotating number is greater than the array length
        d %= n;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n -1);
        reverseArray(arr, 0, n-1);
    }

    private static void reverseArray(int arr[], int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
