package recursion;

public class R_14_TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        char a = 'A';
        char b = 'B';
        char c = 'C';
//        System.out.println(towerOfHanoi(n, a, b, c));

    }

    private static void towerOfHanoi(int n, char A, char B, char C){
        if(n==1) return;
        towerOfHanoi(n-1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        towerOfHanoi(n-1, B, A, C);
    }
}
