package Arrays.Array;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {2 ,4 ,8 ,12 ,15 ,10 ,7};
        System.out.println(linearSearch(arr, 15));
        System.out.println(binarySearch(arr,15));
    }

    // 2 4 8 12 15 10 7 , x = 15
    // 0 1 2  3  4  5 6  index
    // output : 4
    // if x = 6, output : -1
    // Linear Search => search linearly
    // iterate through the array
    // Time O(n)
    // Space O(1)
    // n * (1/2)^k = 1
    // n * (1/2^k) = 1
    // n = 2^k
    // log n = log2 k
    // log n = k
    // Searching can be improved with Hashing.
    private static int linearSearch(int[] arr , int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }

    // Sorted Array - Iterative Approach
    // Binary Search on sorted array
    // 2, 5, 6, 10, 15, 20, 30, x = 15
    // 0, 1, 2,  3,  4,  5,  6  index
    // Time O(log n)
    // Every time you reduce the search by n/2
    // n + n/2 + n/4 + ... + 1 = log2 n
    // 2^x = n
    // log2 x = log2 n
    // Space O(1)
    private static int binarySearch(int[] arr, int x){
        int n = arr.length;
        int left = 0;
        int right = n -1;
        while(left <= right){
            int mid = (left + right-1) /2;
            if(arr[mid] == x) return mid;
            else if(arr[mid] < x) left = mid + 1;
            else right = mid -1;
        }
        return -1;
    }
}
