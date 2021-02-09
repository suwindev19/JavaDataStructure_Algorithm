package recursion;

public class R_12_ropeCuttingProblem {
    public static void main(String[] args) {
        System.out.println(ropeCutting(23, 11, 9, 12));
    }


    // Time depends on a, b and c
    // Time O(3^n) leave
    static int ropeCutting(int n, int a, int b, int c){
        if(n == 0) return 0;
        if(n < 0) return -1;
        int result = Math.max(ropeCutting(n-a,a, b, c),
                Math.max(ropeCutting(n-b, a , b, c),
                        ropeCutting(n-c, a, b, c)));
        if(result == -1)
            return -1;
        return result +1;

    }

}
