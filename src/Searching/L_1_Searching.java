package Searching;

import java.util.Arrays;

/*
Linear Search
    search for an element in the array
    element are inside the box.
    Pick every box and search within the box
    Search element one by one

    Best time O(1)
    Worst time O(n)

Binary Search
    Faster compared to linear search
    good for larger array
    Time log(n)
    it is while loop, not for, because you don't know how many iterations will happen.

    - Array must be sorted.
    - Step 1 : create three variables called start, end, and mid
    - Step 2 : Keep continuing till start < end while(start <= end)
    - Step 3 : Calculate mid position : (start + end) / 2
    - Step 4 : Check if value at mid position is == value to be search
    - Step 5 : If equals, then stop the loop and return i;
    - Step 6 : If value at mid position is less than the value to be searched, then change start position to mid + 1
    - Step 7 : if value at mid position is greater, then change end to end = mid -1
    - Step 8 : If start value is greater than end, the element is not found.
    -

 */
public class L_1_Searching {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 6, 7, 8, 45, 67};
//                 i        ^
        //         2 != 45 , go into else part, return 0
        int elementToBeFound = 450;
//        System.out.println(linearSearch(arr, elementToBeFound));
        System.out.println(binarySearch(nums, elementToBeFound));

    }

    public static int linearSearch(int[] nums, int elementToBeFound){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == elementToBeFound){
                return i;
            }
        }
        return 0;
    }

    /*
        - Array must be sorted.
    - Step 1 : create three variables called start, end, and mid
    - Step 2 : Keep continuing till start < end while(start <= end)
    - Step 3 : Calculate mid position : (start + end) / 2
    - Step 4 : Check if value at mid position is == value to be search
    - Step 5 : If equals, then stop the loop and return i;
    - Step 6 : If value at mid position is less than the value to be searched, then change start position to mid + 1
    - Step 7 : if value at mid position is greater, then change end to end = mid -1.
        Repeat step 3 to 7
    - Step 8 : If start value is greater than end, the element is not found.
                  0  1    2  3   4 5  6   7  8
    int[] nums = {2, 30, 45, 2, 3, 4, 5, 6, 79};
    target = 45

     */

    public static int binarySearch(int[] nums, int target){

        int start = 0;
        int end = nums.length-1;
        while(start <=end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid +1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }
        }
        if(start > end){
            return -1;
        }
       return 0;
    }

}
