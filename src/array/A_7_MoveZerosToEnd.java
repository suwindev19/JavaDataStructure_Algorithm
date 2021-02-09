package array;
/*
Move all zeroes to the end
input arr[ ] = {8, 5, 0, 10, 0, 20 }
output arr [ ] = { 8, 5, 10, 20}

input {
 */

import java.util.Iterator;

public class A_7_MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 10, 0, 20};
        int[] arr1 = {0, 0, 0, 10, 0, 0};
        int[] arr2 = {10, 20};

        moveAllZerosToEnd(arr1);
    }

    /*
    naive solution
    Time (O^2)
    Space
     */
    public static void moveAllZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

}

