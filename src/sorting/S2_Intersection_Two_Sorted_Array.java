package sorting;

public class S2_Intersection_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] a = {3, 5, 10, 10, 10, 15, 15, 20};
        int[] b = {5, 10, 10, 15, 30};
        // if there is no common elements,
//        intersectionTwoSortedArray_Naive(a,b);
        intersectionTwoSortedArray_MergeSort(a,b);

    }

    public static void intersectionTwoSortedArray_Naive(int[] a, int[] b){
        int m = a.length;
        int n = b.length;
        for(int i = 0; i < m; i++){
            if(i > 0 && a[i] == a[i-1]){
                continue;
            }

            for(int j = 0; j < n; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    /*
    if(i > 0 && a[i] == a[i-1] -> i++, continue;
    if a[i] < b[j]

    if a[i] > b[j]

    if a[i] == b[j]
     */
    public static void intersectionTwoSortedArray_MergeSort(int[] a, int[] b){
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if( i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(a[i] < b[j]){
                i++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
