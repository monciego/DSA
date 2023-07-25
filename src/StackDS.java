import java.util.Stack;

public class StackDS {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();

        stack.push("Superman");
        stack.push("Batman");
        stack.push("Wonder Woman");
        stack.push("Flash");
        stack.push("Cyborg");

        stack.pop();
        stack.pop();

        System.out.println(stack);

        System.out.println(stack.empty());
    }
}
