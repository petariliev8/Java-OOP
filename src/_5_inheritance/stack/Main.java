package _5_inheritance.stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push("one");
        stack.push("two");
        stack.push("three");


        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
