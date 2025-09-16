package encapsulation;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("shashank");
        stack.push("shazar");
        stack.push("anant");
        System.out.println("stack is like "+ stack);
        System.out.println("stack top element" + stack.peek());
        System.out.println("delete element "+ stack.pop());
        System.out.println("stack after delete "+stack);
        System.out.println("check stack is empty is or not "+ stack.empty());

    }
}
