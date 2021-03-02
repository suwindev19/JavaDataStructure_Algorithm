package linkedList;

class Node2{
    int data;
    Node2 next;
    Node2(int x){
        data = x;
        next = null;
    }
}

public class LL_3_Recursive_Traversal_Singly_LL {
    public static void main(String[] args) {
        Node2 head = new Node2 (10);
        head.next = new Node2(20);
        head.next.next = new Node2 (30);
        head.next.next.next = new Node2(40);
        recursivePrint(head);
    }

    public static void recursivePrint(Node2 head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        recursivePrint(head.next);
    }
}
