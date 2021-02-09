package leetCode;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class lc_414_ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {4,4,4, 5};
//        System.out.println(thirdMaximumNumber(arr));
        System.out.println(thirdMaximumNumber_HashSet(arr));
    }
    // Another approach
    // non empty array , hashset, hashmap
    // Hashset is a set that does not allow duplicates
    // Hashing algorithm
    private static int thirdMaximumNumber_HashSet(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        // Iterate through array and add to set
        for(int a : arr){
            set.add(a);
        }
        if(set.size() >=3){
            set.remove(Collections.max(set)); // remove max value
            set.remove(Collections.max(set)); // remove second max value
        }
        return Collections.max(set);
    }



    // Time must be O(n), therefore, you cannot sort it.
    private static int thirdMaximumNumber(int[] arr){
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for(Integer a : arr){
            if(a.equals(max) || a.equals(secondMax) || a.equals(thirdMax)){
                continue;
            }
            if(max == null || a > max){
                thirdMax = secondMax;
                secondMax = max;
                max = a;
            }else if( secondMax == null || a > secondMax){
                thirdMax = secondMax;
                secondMax = a;
            }else if(thirdMax == null || a > thirdMax){
                thirdMax = a;
            }
        }

        if(thirdMax == null){
            return secondMax;
        }
        return thirdMax;
    }
}
