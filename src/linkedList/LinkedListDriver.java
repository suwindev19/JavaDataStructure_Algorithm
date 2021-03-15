package linkedList;

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeToStart(30);
        list.addNodeToStart(20);
        list.addNodeToStart(10);

        list.printList();
        System.out.println("Add node before, after and to last ");
        list.addNodeAfter(30,25);
        list.addNodeBefore(20, 15);
        list.addNodeToLast(50);
        list.printList();
    }
}
