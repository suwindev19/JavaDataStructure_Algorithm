package W2_Arrays;


import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        findLargestElement();
        System.out.println(findLargestElement_Sorting());
    }

    //================ One Dimensional Arrays================================
    //1. Find the largest element in the array
    // Iterative approach
    // Time Complexity O(n) | Space O(1)
    static void findLargestElement(){

        int[] a = { 2, 4, 56, 7, -2, 34};
        int largest = a[0];
        for(int i = 0; i < a.length; i++){
            if( a[i] > largest)
                largest = a[i];
            
        }
        System.out.println(largest);
    }

    // Sorting approach
    static int findLargestElement_Sorting(){
        int[] a = { 2, 4, 56, 7, -2, 34};
        Arrays.sort(a);
        return a[a.length -1];
    }

    //2. Find an element in the array
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
