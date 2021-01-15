package Arrays;


import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
//        findLargestElement();
//        System.out.println(findLargestElement_Sorting());
//        System.out.println(findElementInArray());
//        findElementInArray2(new int[]{ 2, 4, 56, 7, -2, 34}, 3);
        //=======================================================
        // Find an element in an array using Binary Search
//        int[] a = { 2, 4, 56, 7, -2, 34};
//        int first = a[0];
//        int last = a.length -1;
//        int elementToFind = 7;
//        int result = findElementInArray(a, first, last, elementToFind);
//        if(result == -1)
//            System.out.println("Element not found");
//        else
//            System.out.println("Element is found at index : " + result);
        //===============================================================
        reverseElementsInArray();

    }

    //================ One Dimensional Arrays================================
    //1. Find the largest element in the array
    // Iterative approach
    // Time Complexity O(n) | Space O(1)
    static int findElementInArray(int[] arr, int first, int last, int elementToFind){
        if(last >= first){
            int mid = (first + last)/2;
            if(arr[mid] == elementToFind){
                return mid;
            }
            else if(arr[mid] > elementToFind) {
                mid = mid - 1;
                return findElementInArray(arr, first, mid, elementToFind);
            }
            else if(arr[mid] < elementToFind){
                mid = mid + 1;
                return findElementInArray(arr, mid, last, elementToFind);
            }
        }
        return -1;

    }

    // Sorting approach
    static int findLargestElement_Sorting(){
        int[] a = { 2, 4, 56, 7, -2, 34};
        Arrays.sort(a);
        return a[a.length -1];
    }

    //2. Find an element in the array Method 1
    static int findElementInArray(){
        int elementToFind = 3;
        int[] a = { 2, 4, 56, 7, -2, 34};
        for(int i = 0 ; i < a.length; i++){
            if( elementToFind == i)
                return elementToFind;
            else
                return -1;
        }
        return elementToFind;

    }

    //2. Find an element in the array Method 2
    static void findElementInArray2(int[] arr, int elementtoFind){
        boolean test = false;
        for(int element : arr){
            if(element == elementtoFind){
                test = true;
                System.out.println("Element " + elementtoFind + " is in the Array!!");
                break;
            }
            else
                System.out.println("Element is not in the Array");
        }
    }

    //2. Find an element in the array Method 3
    static void findElementInArray3(int[] arr, int elementToFind){
        int result = Arrays.binarySearch(arr, elementToFind);
        System.out.println(result);

    }
    //3. Reverse elements in an array
    static void reverseElementsInArray(){
        int[] arr = { 2, 4, 56, 7, -2, 34};
        int reversedArray ;
        for(int i = arr.length -1; i >= 0 ; i--){
            reversedArray = arr[i];
            System.out.print(reversedArray + " ");
        }
    }
    //3. Sort an array in ascending order
    //4. Display second largest element in the array with or without sorting the array
    //5. Reverse the elements of the array

    //*================ Two Dimensional Array*================================
    //6. Add, sub 2D array of 2 x 2 matrix
    //7. Transpose a matrix
    //8. Add all the elements of the matrix
    //
    //*================ Miscellaneous ========================================
    //9. Find the cube of a number
    //10. Find the factorial of a number
    //11. Reverse the digits of a number
    //12. Check given string is palindrome or not
    //13. Check given number is even or odd
    //14. Generate 'n' Fibonacci numbers
    //15. Check given numbers is prime or not
    //16. Swap two numbers
    
}
