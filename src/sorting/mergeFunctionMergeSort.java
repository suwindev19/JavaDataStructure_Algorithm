package sorting;

public class mergeFunctionMergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 20, 30};
        mergeFunction(arr, 0, 2, 4);
    }
    // Time Theta(n)
    //
    public static void mergeFunction(int[] arr, int low, int mid, int high){

        // Setting up the auxillary array
        int[] left = new int[mid-low+1];
        int[] right = new int[high-mid];
        for(int i = 0; i < mid -low+1;i++){
            left[i] = arr[low+i];
        }
        for(int i = 0; i < high-mid;i++){
            right[i] = arr[mid-low+1+i];
        }

        int i = 0, j = 0, k = 0;
        while ((i< mid-low+1) && (j < high-mid)){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < mid-low+1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < high-mid){
            arr[k] = right[j];
            j++;
            k++;
        }

        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
