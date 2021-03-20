package stack;
/*
Applications of Stack data structures

    - Functions calls
    - checking for balanced parenthesis
    - reversing items
    - infix to prefix/ postfix

    - evaluation of postfix, prefix
    - stack span problem and its variations
    - undo/ redo or forward/ backward
 */
class MyStack_LinkedList {
    int size;
    MyStack_Node head;

    MyStack_LinkedList() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty(){
        return (head == null);
    }

    void push(int data) {
        MyStack_Node temp = new MyStack_Node(data);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop(){
        if (head==null) {
            return Integer.MAX_VALUE;
        }
        int result = head.data;
        head = head.next;
        return result;
    }

    int peek() {
        if (head == null)
            return Integer.MAX_VALUE;
        return head.data;
    }
}
