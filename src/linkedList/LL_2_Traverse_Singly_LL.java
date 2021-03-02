package linkedList;

class Node1{
    int data;
    Node1 next;
    Node1 (int x){
        data = x;
        next = null;
    }
}


public class LL_2_Traverse_Singly_LL {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        printList(head);
    }

    public static void printList(Node1 head){
        Node1 curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
