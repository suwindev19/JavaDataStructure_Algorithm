package recursion;

import java.util.LinkedList;
import java.util.List;

public class R_15_recursion {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinations(int[] n){
        List<List<Integer>> results = new LinkedList<>();
        combinations(n, 0, results, new LinkedList<Integer>());
        return results;
    }

    private static void combinations(int[]n, int i, List<List<Integer>> results, List<Integer> path) {
        if (i == n.length) {
            results.add(path);
            return;
        }

        List<Integer> pathWithCurrent = new LinkedList<>();
        pathWithCurrent.add(n[i]);
        // FInd all the combinations that exclude current item
        combinations(n, i+1, results, path);
        combinations(n, i+1, results, pathWithCurrent);
    }

}
