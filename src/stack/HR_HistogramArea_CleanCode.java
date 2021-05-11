package stack;
import java.util.Stack;
public class HR_HistogramArea_CleanCode {
    public static void main(String[] args) {
        int histogram[] = {1, 3, 5, 2};
        System.out.println(largestRectangleArea(histogram));
    }

    public static int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < height.length;i++) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                int currHeight = height[stack.pop()];
                int currWidth = i - stack.peek() -1;
                int currArea = currHeight * currWidth;
                maxArea = Math.max(currArea, maxArea);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int currHeight = height[stack.pop()];
            int currWidth = height.length - stack.peek() -1;
            int currArea = currHeight * currWidth;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
