package Stack;

import java.util.Stack;

public class NextLargestElement {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        Stack<Long> stack = new Stack<>();
        long[] res = new long[n];
        for (int i = n-1; i >=0  ; i--) {
            while (!stack.isEmpty() && stack.peek()<=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = -1;
            }
            else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }

}
