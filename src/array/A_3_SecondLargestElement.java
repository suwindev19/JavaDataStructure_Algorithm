package array;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;

public class A_3_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 20, 12, 20, 10, 9, 2 , -1, 78};
        int n = arr.length;
        // corner case if all the elements are the same, return -1
//        System.out.println(secondLargestElement(arr));
//        System.out.println(thirdLargestElement(arr));
        System.out.println(secondLargest_1(arr));
    }
    //---------------------------------------------------
    // more efficient solution
    /*
    input: arr[ ] = {10, 5, 8, 20}
    output: index of second largest element 10

    input: arr[ ] = {20, 10, 20, 8, 12}
    output: Index of 12

    input: arr[ ] = {10, 10, 10}
    output // -1 no second largest element
    */
    // Time O(n)
    // Space O(1)
    private static int secondLargest_1(int [] arr){
        // assign mininum values to both of them
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        // traversing an array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }


    //---------------------------------------------------
    // loop twice approach
    private static int thirdLargestElement(int[] arr){
        int secondLargest = secondLargestElement(arr);
        int thirdLargest = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[secondLargest]){
                if(thirdLargest == -1){
                    thirdLargest = i;
                }else if(arr[i] > arr[thirdLargest])
                    thirdLargest = i;
            }
        }
        return thirdLargest;
    }

    private static int secondLargestElement(int[] arr){
        int firstLargest = firstLargestElement(arr);
        int secondLargest = -1;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] != arr[firstLargest]){
                if(secondLargest == -1)
                    secondLargest = i;
                else if(arr[i] > arr[secondLargest])
                    secondLargest = i;
            }
        }
        return secondLargest;
    }

    private static int firstLargestElement(int[] arr){
        int firstLargest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > firstLargest){
                firstLargest = i;
            }
        }
        return firstLargest;
    }
}
