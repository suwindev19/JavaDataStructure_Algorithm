package divideAndConquer;
import java.math.*;
public class lc_973_K_ClosestPointsToOrigin {
    public static void main(String[] args) {

    }

    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][];

        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[row].length; col++){
                 int distance = (int) Math.sqrt( Math.pow(points[row][col] - 0, 2) + Math.pow(points[row+1][col+1] -0, 2));
            }
        }

        return result;
    }
}
