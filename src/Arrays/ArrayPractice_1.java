package Arrays;

public class ArrayPractice_1 {

    public static void main(String[] args) {
//        determineOddandEvenNum(); // Array problem 1
        findOddOccurrence();

    }

    // Array problem 1
    // 1) { 2, 2, 2, 2, 1, 1, 1}
    // Determine odd Number and even number count.
    //------------------------------------------------
    // Pseudocode
    //------------------------------------------------
    // initialise two variables : evenCount and oddCount to 1
    // Iterate through each elements
    // Divide each element by 2 and find remainder
    // If the remainder is equal to 0, the element is even.
    // Store the count to evenCount and keep increment if condition is met.
    // If the remainder is NOT equal to 0, the element is odd.
    // Store the oddCount
    //------------------------------------------------
    // Time O(n) | Space O(1)

    static void determineOddandEvenNum(){
        int[] array = { 2, 2, 2, 2, 2, 1, 1, 1, 1};
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                evenCount += 1;
            }
            if( i % 2 != 0){
                oddCount +=1;
            }
        }
        System.out.println("Total even count is : " + evenCount);
        System.out.println("Total odd count is : " + oddCount);
    }

    // Array problem 2
    // 345, 445, 545
    //------------------------------------------------
    // Pseudocode
    //------------------------------------------------
    // Find the Number Occurring Odd Number of Times. Given an array of positive integers.
    // All numbers occur even number of times except one number which occurs odd number of times.
    // Find the number in O(n) time & constant space.
    // Input : arr = {1, 2, 3, 2, 3, 1, 3}
    // Output : 3

    // Use bitwise operator
    // XOR exclusive operator
    // 1    1       0
    // 1    0       1
    // 0    1       1
    // 0    0       0
    //

    // Time O(n) | Space O(1)
    static void findOddOccurrence(){
        int[] array = {15,99, 15, 99, 25, 15, 12, 12, 99, 25, 99, 15, 99};
        int result = array[0];
        for(int i = 1; i < array.length ; i++){
            result = result ^array[i];
        }
        System.out.println(result);
    }


    // Array problem 2
    // { 1, 2, 4, 5, 3, 3, 6 }
    // Find duplicate number
    //------------------------------------------------
    // Pseudocode
    //------------------------------------------------
    // Iterate through the array
    //

    static void findDuplicateNum(){

    }

    // Array problem 3
    // { 0, 1, 2, 1, 0, 1, 2 }
    // Segregate
    // Sort the array to { 0, 0, 1, 1, 1, 2, 2 }
    //------------------------------------------------
    // Pseudocode
    //------------------------------------------------
    //


    // Array problem 4
    // { -2, -3, 4, -1, -2, 1, 5, -3 } => maximum contigous Sum
    // e.g. 1 + 5 = 6
    // e.g. 4 + -1 + 1 + 5 = 9
    //------------------------------------------------
    // Pseudocode
    //------------------------------------------------
    //


}
