package stack;

public class MyStack_ArrayList_Driver {
    public static void main(String[] args) {
        MyStack_ArrayList al = new MyStack_ArrayList();
        al.push(20);
        al.push(25);
        al.push(30);
        System.out.println(al.peek());
        System.out.println(al.size());
    }
}
