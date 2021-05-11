package Set;

import java.util.Comparator;
/*
Collection
            Set

            HashSet             SortedSet           Comparable vs Comparator

            LinkedHashSet       NavigableSet

                                TreeSet

 */
public class S3_Comparator implements Comparator {
    @Override
    public  int compare(Object o1, Object o2) {
        Integer d1 = (Integer) o1;
        Integer d2 = (Integer) o2;

        if (d1 < d2){
            return +1;
        } else if (d1 > d2){
            return -1;
        } else{
            return 0;
        }
    }
}
