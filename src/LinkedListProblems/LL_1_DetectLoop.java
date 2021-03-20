package LinkedListProblems;

public class LL_1_DetectLoop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(10); // t0
        Node t1 = list.insertAtLastNode(20);
        Node t2 = list.insertAtLastNode(30);
        Node t3 = list.insertAtLastNode(40);
        Node t4 = list.insertAtLastNode(50);
        t4.next = t2;
        System.out.println(detectLoop(list));

    }

    public static boolean detectLoop(LinkedList list) {
        boolean hasLoop = false;
        Node slow = list.head;
        Node fast = list.head;
        while (slow != null && fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        return hasLoop;
    }
}
