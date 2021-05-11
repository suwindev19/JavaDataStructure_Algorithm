package LinkedListProblems;

public class LL_3_ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Number> list = new LinkedList<Number>();
        list.insertAtStart(10);
        Node t2 = list.insertAtLastNode(20);
        Node t3 = list.insertAtLastNode(30);
//        Node t4 = list.insertAtLastNode(40);
//        Node t5 = list.insertAtLastNode(50);
        list.printLinkedList();
        System.out.println("After reversing: ");

        Node head = reverseRecursively(list.head);
        reverseList(list);
        list.printLinkedList();

    }

    private static Node reverseList(LinkedList<Number> list) {
        Node current = list.head;
        Node previous = null;

        while (current !=null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static Node reverseRecursively(Node head) {
        if (head != null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        Node temp = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;

        // Send the new head node in every recursion
        return temp;
    }
}
