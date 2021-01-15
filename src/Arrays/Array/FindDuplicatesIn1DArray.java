package Arrays.Array;

/**
 * The problem is that we want to find duplicates in a T[] one-dimensional array of integers in O(N) running time where the integer values are smaller than the length of the array!
 *
 * Approach
 * 1) Brute force approach - compare items with all the rest, Time O(n^2)
 * 2) Hashmap - traverse the array and insert each item into hashtable with the values as key. If you cannot insert the item, it means it is a duplicate
 *  It is not an in-place algorithm
 * 3) Using absolute values - with this approach, you can achieve O(n) Time and O(1) Space
 *
 * Array = { 2, 3, 1, 2, 4, 3}
 * Iterate through the array.
 * Consider each item.
 * 2
 * T[abs*T[0])] = T[2] 1 > 0 yes. The value at that index is positive. Therefore flip the sign of T[2] = -1
 * T[abs*T[1])] = T[3] 2 > 0 yes, therefore -2
 * T[abs*T[2])] = T[1] 3 > 0 yes, therefore -3
 * T[abs*T[3])] = T[2] -1 < 0 yes, -1
 * T[abs*T[4])] = T[4] 4 >  0 yes, -4
 * T[abs*T[5])] = T[3] 3 >  0 yes, -3
 */
public class FindDuplicatesIn1DArray {
    public void findDuplicatesIn1DArray(int[] array){
        for(int i = 0; i < array.length ; i++){
            // if this value is positive, flip the sign
            if(array[Math.abs(array[i])] > 0){
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
            }else{
                // otherwise, it is a negative. It means repetition
                System.out.println(Math.abs(array[i]) + "is a repetition!");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3, 4};
        FindDuplicatesIn1DArray array = new FindDuplicatesIn1DArray();
        array.findDuplicatesIn1DArray(arr);
    }
}
