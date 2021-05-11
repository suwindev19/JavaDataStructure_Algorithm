package sorting;

import java.lang.reflect.Array;
import java.util.*;

/*
Divide and conquer algorithm
============================
1. Divide, conquer algorithm
    divide the array into two parts
    recursively sort those two parts
    then merge
    divide and conquer and merge
2. Stable sorting algorithm

3. Time - Theta(n log n)
    Space - O(n) Auxiliary space (not in place sorting algorithm)
    Block merge sort Time O(log n), in place
4. Well suited for linked lists. Works in O(1) auxillary space
5. Suited for external sorting
6. Outperforms by quick sort
    merge sort is used in many standard libraries
    Java 8 - both merge sort and quick sort


 */
public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] a = {10, 15, 20};
        int[] b = {5, 6, 6, 15};
        System.out.println(mergeSort_Approach(a,b));

    }
    // Naive Approach
    public static int[] mergeSort_Approach(int[] m, int[] n){
        int mLen = m.length;
        int nLen = n.length;
        int[] result = new int[mLen + nLen];
        for(int i =0; i < mLen; i++){
            result[i] = m[i];
        }

        for(int i =0; i < nLen; i++){
            result[mLen+i] =n[i];
        }
        Arrays.sort(result);
        for(int i : result){
            System.out.print(i+ " ");
        }
        return result;
    }
}


/*
------------------------------------------------------------------------
// Arrays.sort() primitive types - sort in increasing order
// If you want to sort in decreasing order, you need to reverse it after sorting.
------------------------------------------------------------------------
Bubble Sort
- 1st Pass : maximum element reaches to its final position
- 2nd Pass : second largest element reaches to its 2nd last position
- 3rd pass : Bubble up to its correct position
First Pass
    2   10  8   7
    2   10  8   7
    2   8   10  7
    2   8   7   10

    n-1 elements are sorted.

   // Optimised Bubble Sort
    // Stability - stable sorting algorithm
    // In place algorithm
    // If the values are the same, they will remain as it.
    // Time O(n * (n-2)/2
    // Theta(n^2)
    public static void main(String[] args) {
        //             0  1  2   3  4  5   6   7   8
        int[] array = {3, 4, 8, -9, 2, 0, 56, 90, 23};
        int n = array.length; // 9
        for(int i =0; i < n; i++){
            boolean swapped = false;
            // since the swapped element is in its correct position
            // for the next time, you will only need to iterate
            // only up to n-i-1
            // optimisation
            for(int j =0; j < n-i-1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

    }
------------------------------------------------------------------------
Insertion Sort :
- Time O(n^2) worst case
- In place and stable
- used in practice for small arrays (TimSort and IntroSort)
- O(n) in best case
- most sufficient algorithm for small array set

    20  5   40  60  10  30
    --
    5   20  40  60  10  30
    ------
    5   20  40  60  10  30
    ----------
    5   20  40  60  10  30
    --------------
    5   10  20  40  60  30
    ------------------
    5   10  20  30  40  60
    ----------------------

        0        i             n-1
        --------------------------
        Sorted  Key     Unsorted
        --------------------------
===>    i goes from i to n-1
------------------------------------------------------------------------
Selection Sort : Theta(n^2) algorithm
- Docs less memory writes compared to quicksort, mergesort, insertion sort, etc.
- Cycle sort is optimal in terms of memory writes
- Basic idea for HeapSort
- Not stable
- In place sorting algorithm
   // Selection Sort
    // Find out the minimum element and place it in the first position
    // Find out the second minimum element and place it in the 2nd position
    public static void main(String[] args) {
        int[] array = {3, 4, 8, -9, 2, 0, 56, 90, 23};
        System.out.println(sortArray_InsertionSort(array));
        for(int i : array){
            System.out.print(i+ " ");
        }
    }
    // Insertion Sort is not stable
    // Stability
    // (n-1) + (n-2) + (n-3) + ... + 2 + 1
    // n * (n-1)/2
    // Theta(n^2)
    public static int[] sortArray_InsertionSort(int[] array){
        int n = array.length;
        for(int i =0; i < n-1;i++){
            int min = i;
            for(int j = i + 1; j < n ;j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    ----------------------------------------------
  public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        insertionSort(nums);
        for(int i : nums){
            System.out.print(i+ " ");
        }

    }
    // Time Best case Theta(n)
    // Worst case Theta(n^2)
    // Big
    public static int[] insertionSort(int[] nums){
        int n = nums.length;
        for(int i =1; i < n; i++){
            for(int j = i -1; j < i ; j++){
                if (nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] =temp;
                }
            }
        }
        return nums;
    }
------------------------------------------------------------------------
Merge Sort Algorithm
=======================

------------------------------------------------------------------------
Overview of Sorting Algorithms
1. Binary Array - Partition algorithm of quick sort
    Lomato, Hoare
2. Array with three values (0, 1 and 2)
    Array elements occur multiple times and you want to put all elements
3. Array of size n and range is size n^2 or n# or
50000
    O(k) Counting sort is good algorithm when your range is small
    Radix sort
    0 to n^2 or n^3
    Time O(n)
    Space O(n)
4. Array of uniformly distributed data over a range
    Bucket Sort
    Time O(n)
5. When memory writes are costly
    Every write reduces age of memory
    Selection sort - does minimum number of swap compared to other algorithms
    Cycle sort
    Time O(n^2)
    Optimum for
6. When adjacent swaps are allowed
    Bubble Sort
    Cocktail sort - travel from both sides
7. When array size is small
    Selection sort
    Insertion sort - size 10 to 20
8. When available extra memory is less
    Quick sort - extra space for recursion call
    merge sort - extra space for recursion call
    Optimised merge sort - still needs extra space log n
    Shall Sort - does not use extra memory
    (n log^2 n)
    O(n (log n)^2)


 General Purpose sorting algorithms
 - merge sort - n log n - Divide and Conquer method
                        - log^2 n
 - heap sort  - n log n
 - quick sort - fastest of them all  - Divide and conquer
              - not stable by default
              - good for LinkedList with same time complexity

 Hybrid Algorithms
 - Tim sort (insertion
 - IntroSort (quick sort, heap sort and insertion sort)
    in general , use quick sort. If number of recursion goes beyound log n,
    change to heap sort.

-----------------------------------------------------------------------
        int[] array1 = {5, 20, 12, 30};
//        char[] array2 = {'B', 'B', 'A', 'C', 'A'};
////        Arrays.sort(array1);
////        System.out.println(Arrays.toString(array1));
////        Arrays.sort(array2);
////        System.out.println(Arrays.toString(array2));
//        Arrays.sort(array1, 1, 4);
//        System.out.println(Arrays.toString(array1));

-----------------------------------------------------------------------
class Point1 implements Comparable<Point1>{
    int x, y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p){
        return this.x - this.y;
    }
}
    public static void main(String[] args) {
        Point1[] arr = {new Point1(10, 20), new Point1(3, 12), new Point1(4, 56)};
        Arrays.sort(arr);
        for(int i =0; i < arr.length;i++){
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
---------------------------------------------------------------------
class MyComparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return a % 2 - b % 2;
    }
}
public class SortingAlgorithms {
    public static void main(String[] args) {
        Integer array[] = {5, 10, 15, 20, 3, 6, 5, 7, 8, 9};
        Arrays.sort(array, new MyComparator());
        System.out.println(Arrays.toString(array));
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));
    }
}
-----------------------------------------------------------------------
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(50);
        list.add(20);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
-----------------------------------------------------------------------

 */
