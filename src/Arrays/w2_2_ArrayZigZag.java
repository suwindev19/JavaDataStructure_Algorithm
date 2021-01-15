package Arrays;
/*
Given an array, rearrange the elements of array in zigzag
i/p : 4 3 7 8 6 2 1
o/p : 3 7 4 8 2 6 1

Arrays numbers of the same elements but in different arrangements
a[0] < a[1] > a[2] < a[3] > a[4] < a[5]
a[0] > a[1] < a[2] > a[3] < a[4] > a[5]

Iterative the array. Start from the index 1
Store arr[0] in the temp.
Start
App1:
1. Sort the element Arrays.sort()

Values -> 1 2 3 4 6 7 8
Index ->  0 1 2 3 4 5 6
swap 1 and 2
2 1
4 3
7 6
8

2 1 4 3 7 6 8
Sort the element and swap i and i+1 progress by i = i + 2
O(n logn)+ O(n)

Approach 2
============

For all even position a[i] < a[i+1]
For all odd positions a[i] > a[i+1]
          e o e o e o e
Values -> 4 3 7 8 6 2 1
Index ->  0 1 2 3 4 5 6

a[0] < a[1]
swap(4 3)

a[1] > a[2]
swap(4,7)

s


i % 2 == 0 // even position
a < b

i % 2 == 1 // odd position
a > b



 */
public class w2_2_ArrayZigZag {
    public static void main(String[] args) {

    }
    //
    public void rearrange(int[] a, int n){
        for(int i = 0; i < n-1; i++){
            if(i % 2 == 0){
                if(a[i] > a[i+1])
                    swap(a[i], a[i+1]);
            }
            else{ // a > b
                if(a[i] < a[i+1]){
                    swap(a[i], a[i+1]);
                }

            }
        }
    }

    public void swap(int a, int b){

    }


}
