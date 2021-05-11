package stack;

import java.util.Stack;

public class HR_HistogramArea {


    public static void main(String[] args) {
        int histogram[] = {2,1, 5, 6, 2, 3};
//        int histogram[] = {2,2,1,3,4,1,2};
        System.out.println(largestRectangleArea(histogram));
    }

    public static int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int currentArea = 0;
        int i = 0;
        while (i < height.length) {
            // push index to stack when the current height is larger than the previous one
            if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                // if height
                int top = stack.pop();
                if (stack.isEmpty()) {
                    // if it is a last building
                    currentArea = height[top] * i;
                } else {
                    currentArea = height[top] * (i - stack.peek() -1);
                }
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (stack.isEmpty()) {
                currentArea = height[top] * i;

            } else {
                System.out.println(i);
                currentArea = height[top] * (i - stack.peek()-1);

            }
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
        }
        return maxArea;
    }


}
