package sorting;
/*
Not optimal for memory write
memory write
O(n^2)
Does less memory writer compared to QuickSort, MergeSort, Insertion Sort, etc.
CycleSort is optimal in terms of memory writer
- basic idea for heapsort
- not stable, in place , order of equal elements may change

Find the minimum element
put it at the beginning of the array
vacant slot becomes infinite

 */
public class Selection_Sort_GFG {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2, 18};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
