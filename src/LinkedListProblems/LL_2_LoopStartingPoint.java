package LinkedListProblems;

public class LL_2_LoopStartingPoint {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(10);
        Node t2 = list.insertAtLastNode(20);
        Node t3 = list.insertAtLastNode(30);
        Node t4 = list.insertAtLastNode(40);
        Node t5 = list.insertAtLastNode(50);
        t5.next = t3;
        System.out.println(detectLoopAndReturnNode(list).data);
    }

    public static Node detectLoopAndReturnNode(LinkedList list) {
        boolean hasLoop = false;
        Node slow = list.head;
        Node fast = list.head;
        while (slow !=null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        if(hasLoop) {
            slow = list.head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return fast;
        }
        return null;
    }
}
