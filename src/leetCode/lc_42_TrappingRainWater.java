package leetCode;

import java.util.Stack;

public class lc_42_TrappingRainWater {
    public static void main(String[] args) {
        int height[] = {9,1,4,0,2,8,6,3,5};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int i = 0;
        while (i < height.length) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.peek();
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = i - stack.peek() -1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                ans = ans + boundedHeight * distance;
            }
            stack.push(i++);
        }
        return ans;
    }
}
