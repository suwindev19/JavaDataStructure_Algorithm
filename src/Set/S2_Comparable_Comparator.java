package Set;
/*
Comparable Interface
---------------------
    - present in java.lang package
    - has only one method
        - public int compareTo(Object ob){

          }
        - meant for default natural sorting order
        - add M, R, K to TreeSet
        TreeSet data = new TreeSet();
        data.add("M");
        data.add("R");
        data.add("K");

        "R".compareTo("M");
        "K".compareTo("M");
        follow balance tree Structure

        obj1 = object to be inserted
        obj2 = object already inserted
        obj1.compareTo(obj2)
        obj1 < obj2         obj1 == obj2        obj1 > obj2
            -1                   0                   +1

        default natural sorting order


Comparator Interface - Customised the sorting or descending order
-----------------------------------------------------------------
    - present in java.util package
    - Methods
        - public int compare(Object obj1, Object obj2) - customised sorting order
            - give your own implementation
        - public boolean equals(Object obj)
             - implementation is not required
             - Object is the super/ parent class for every java class. equals() method is already present in that.
 */

import java.util.Comparator;
import java.util.TreeSet;

public class S2_Comparable_Comparator  {
    public static void main(String[] args) {
        // Comparable interface - compareTo() method
//        TreeSet s = new TreeSet();
//        s.add(152);
//        s.add(150);
//        s.add(185);
//        s.add(254);
//        s.add(100);
//        s.add(132);
//        s.add(100);
//
//        System.out.println(s);
//        // 152
//        // JVM calls this compareTo method
//        //          152
//        //      150     185
//        //  100    132      254
        //-----------------------------------------------------
        TreeSet s = new TreeSet(new S3_Comparator());
        s.add(152);
        s.add(150);
        s.add(185);
        s.add(254);
        s.add(100);
        s.add(132);
        s.add(100);

        System.out.println(s);

        //              152
        //      185            150
        //   254            132      100
        //
    }
}
