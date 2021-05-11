package kickStart_April;

public class Codility_1 {
    public static void main(String[] args) {
        int[] A= {47, 1900, 1, 90, 45};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {

        int sum = 0;
        for(int i : A){
            if (Math.abs(i) > 9 && Math.abs(i) < 100){
                sum += i;
            }
        }
        return sum;
    }
}
