package array;

public class A_CommonElements {
    public static void main(String[] args) {
        int source1[] = {1, 4, 1, 5, 9, 2};
        int source2[] = {1, 1, 8, 2, 5, 3};
        int length = source1.length;
        int destination[] = new int[source1.length];

        System.out.println(commonElements( length,source1, source2, destination));
    }

    public static int commonElements(int length, int source1[], int source2[], int destination[]) {

        // Insertion sort algorithm for source1[ ]
        int b, key, count = 0;
        for (int a = 1; a < source1.length; a++) {
            key = source1[a];
            b = a -1;

            while (b >= 0 && source1[b] > key) {
                source1[b+1] = source1[b];
                b --;
            }
            source1[b+1] = key;
        }

        // Insertion sort algorithm for source1[ ]
        // Insertion sort
        int d, key1, count1 = 0;
        for (int c = 0; c < source2.length; c++) {
            key1 = source2[c];
            d = c -1;

            while (d >=0 && source2[d] > key1) {
                source2[d+1] = source2[d];
            }

            source2[d+1] = key1;
            System.out.println(source2[count1]);
        }



        int result = 0;
        for (int i = 0; i < source1.length; i++) {
            for (int j = 0; j < source2.length; j++) {
                if (source1[i] == source2[j] ) {
                    destination[result] = source1[i];
                    result++;
                }
            }
        }
        return result;

        //=============================
//        int i = 0, j = 0, count = 0;
//        while (length > i) {
//            if (source1[i] < source2[j]) {
//                i++;
//            } else if (source1[i] > source2[j]) {
//                j++;
//            } else {
//                destination[i] = source1[i];
//                i++;
//                j++;
//                count++;
//            }
//        }
//        return count;
    }
}
