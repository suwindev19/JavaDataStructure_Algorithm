package stack;

public class MyStack_Array_Driver {
    public static void main(String[] args) {
        MyStack_Array_Implementation stack = new MyStack_Array_Implementation(5);
        stack.push(15);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.capacity);
    }
}
