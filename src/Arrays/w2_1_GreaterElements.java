package Arrays;
/*
given an array replace every element by greater element on right side
(not including the element)

I/p: 16 17 4 3 5 2
O/P: 17 5  5 5 2 -1



 */
public class w2_1_GreaterElements {
    public static void main(String[] args) {
        int[] arr = {16 ,17 ,4 ,3 ,5 ,2};
        replaceByGreaterElement(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] );
        }
    }
/*
Brute Force Approach
====================
1. Iterate through the array from index i  = 0
2. Nested for loop, iterate from index j = i+1 till nums -1;
3. From this nested j loop, I need to compare all the elements
4.

6 2 4 5 3 1
0 1 2 3 4 5
  i+1 ... n-1, find the maximum element and replace
Time O(n^2)

Approach 2
==============
Start from the last index and maintain the max till that index
max = -1

for current element, max as maximum of all elements from i+2 ... n
you have to compare a[i+1] , max to get the current max from i+1 ... n
i , i+1, i+2 , ... + n
          i
values->    6 2 4 5 3   1
index ->    0 1 2 3 4   5
max ->          5 3 1   -1

i = max(i+1, max at i+1)

Approach


 */
    // Time O(n)
    // Space O(1)
    public static void replaceByGreaterElement(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2; i >=0; i--){
            int current = arr[i];
            if(arr[i+1] > temp){
                arr[i] = arr[i+1];
            }
            else{
                arr[i] = temp;
            }
            temp = current;
        }
    }
/*
I/P : 16 17 4 3 5 2
O/P : 17 17 5 5 5 2
 */
    public static void replaceByGreaterElementInclusive(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        arr[n-1] = arr[n-1];
        for(int i = n-2; i >=0; i--){
            int current = arr[i];
            if(arr[i+1] > temp){
                arr[i] = arr[i+1];
            }
            else{
                arr[i] = temp;
            }
            temp = current;
        }
    }
}
