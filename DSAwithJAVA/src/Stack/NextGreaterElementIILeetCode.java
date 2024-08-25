package Stack;

import java.util.Stack;

public class NextGreaterElementIILeetCode {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = n*2-1; i >=0 ; i--) {
            while (!stack.isEmpty() && stack.peek()<=nums[i%n])
            {
                stack.pop();
            }
            if(i<n)
            {
                if(stack.isEmpty())
                {
                    res[i] = -1;
                }
                else {
                    res[i] = stack.peek();
                }
            }
            stack.push(nums[i%n]);
        }
        return res;
    }
}
