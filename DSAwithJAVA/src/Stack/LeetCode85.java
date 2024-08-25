package Stack;

import java.util.Stack;

public class LeetCode85 {
    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length];
        if(matrix.length == 0)
        {
            return 0;
        }
        int largest = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int val = matrix[i][j]-'0';
                if(val == 0)
                {
                    heights[j]=0;
                }
                else {
                    heights[j]+=val;
                }
            }
            int maxArea = largestRectangleArea(heights);
            if(largest<maxArea)
            {
                largest = maxArea;
            }
        }

        return largest;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int element = (i==n)?0:heights[i];
            while (!stack.isEmpty() && heights[stack.peek()]>element)
            {
                int h = heights[stack.pop()];
                int ps = (stack.isEmpty())?-1:stack.peek();
                int w = i-ps-1;
                max = Math.max(max,h*w);
            }
            stack.push(i);
        }
        return (max == Integer.MIN_VALUE)?0:max;
    }
}
