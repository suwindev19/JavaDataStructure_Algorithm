package hashset;

import java.util.HashSet;
import java.util.Set;

public class H5_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 30, 50};
        int[] b = {30, 5, 15, 8};

        intersectionOfTwoArrays_Naive(a,b);
    }

    // Naive Approach
    public static void intersectionOfTwoArrays_Naive(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length;j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                System.out.println(a[i] );
            }
        }
    }

    public static void intersectionTwoArrays_HashSet(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < b.length; i++ ) {
            set.add(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
}
