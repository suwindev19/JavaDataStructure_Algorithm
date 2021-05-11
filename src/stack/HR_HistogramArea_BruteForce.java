package stack;

public class HR_HistogramArea_BruteForce {
    public static void main(String[] args) {
        int histogram[] = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(histogram));
    }

    public static int largestRectangleArea(int h[]) {
        int maxArea = 0;
        for (int i = 0; i < h.length; i++) {
            int minHeight = Integer.MAX_VALUE;
            int currentArea = 0;
            for (int j = i; j < h.length;j++) {
                minHeight = Math.min(minHeight, h[j]);
                currentArea = minHeight * (j - i +1);
                maxArea = Math.max(currentArea, maxArea);
                System.out.println(maxArea);
            }
        }
        return maxArea;
    }
}
