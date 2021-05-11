package leetCode;

public class lc_Design_LinkedList_Singly {
    class Node {
        int val = 0;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;



    /** Initialize your data structure here. */
    public lc_Design_LinkedList_Singly() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        // edge case
        if (index < 0 || index >= this.size) return -1;
        Node cur = this.head;
        while (index-- > 0) {
            cur = cur.next;
        }
        return cur.val;
    }

    public Node getNodeAt(int index) {
        Node cur = head;
        while (index-- > 0) {
            cur = cur.next;
        }
        return cur;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.next = null;
            this.tail = node;

        }
        this.size++;

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size) return;

        if (index == 0) {
            addAtHead(val);
        } else if (index == this.size) {
            addAtTail(val);
        } else {
            Node node = new Node(val);
            Node before = getNodeAt(index-1);
            Node after = before.next;
            before.next = node;
            node.next = after;
            this.size++;

        }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */

    public void deleteAtFirst() {
        if (this.size == 0) return;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node node = this.head;
            Node after = node.next;
            node.next = null;
            this.head = after;
        }
        this.size--;

    }

    public void deleteAtLast() {
        if (this.size == 0)
            return ;
        else if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node secondLast = getNodeAt(this.size -2);
            secondLast.next = null;
            this.tail = secondLast;
        }
        this.size--;
    }

    public void deleteAtIndex(int index) {
        if ( index < 0 || index >= this.size) return;
        if (index == 0) {
            deleteAtFirst();
        } else if (index == this.size-1) {
            deleteAtLast();
        } else {
            Node before = getNodeAt(index -1);
            Node node = before.next;
            Node after = before.next.next;
            before.next = after;
            node.next = null;
            this.size--;
        }

    }
}
