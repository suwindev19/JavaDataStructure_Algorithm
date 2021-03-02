package sorting;

public class S1_Merge_Sort_Algorithm {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 15, 7};
        int low = 0;
        int high = arr.length -1;


    }

    public static void mergeSortAlgorithm(int[] arr, int low, int high){
        // divide sort and then merge, therefore there must be at least two elements
        if(high > low){
            int mid = low + (high - low)/2; // to avoid overflow (low + high)/2 for large array
            mergeSortAlgorithm(arr, low, high);
            mergeSortAlgorithm(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){

    }
}
