package stack;
/*
    This does not handle overflow or underflow.
    No dynamic resizing of the array
 */
class MyStack_Array_Implementation {
    int arr[];
    int capacity;
    int top; // to keep track of index of top item

    MyStack_Array_Implementation(int capacity){
        this.top = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void push(int data) {
        if (top == capacity -1) {
            System.out.println("This stack is full!");
        }
        top++;
        arr[top] = data;
    }

    int pop(){
        if (top == -1) {
            System.out.println("There is no more data to pop! This stack is empty.");
        }
        int result = arr[top];
        top--;
        return result;
    }

    int peek() {
        if (top == -1) {
            System.out.println("There is no more data to pop! This stack is empty.");
        }
        return arr[top];

    }

    int size(){
        return top+1;
    }

    boolean isEmpty() {
        return (top == -1);
    }
}

