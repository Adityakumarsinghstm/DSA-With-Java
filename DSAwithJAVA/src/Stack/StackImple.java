package Stack;

import java.util.Stack;

public class StackImple {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(78);
        stack1.push(8);
        stack1.push(45);

        System.out.println("The top most element in stack before deletion is : "+stack1.peek());
        stack1.pop();
        System.out.println("The top most element in stack after deletion is : "+stack1.peek());
        System.out.println("Element 8 is present at position : "+stack1.search(78));
        System.out.println("Is stack empty or not : "+stack1.empty());
    }
}
